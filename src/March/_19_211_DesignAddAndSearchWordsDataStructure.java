package March;

/**  
* 
*  @Sir Darey
* 
* LeetCode Daily Challenge, March 2023
* Day 19: Problem 211 - Design Add and Search Words Data Structure
* 
*/


public class _19_211_DesignAddAndSearchWordsDataStructure {
	
	class TrieNode {
        private TrieNode [] children;
        private boolean isWord;

        public TrieNode() {
            this.children = new TrieNode[26];
        }
    }

    TrieNode root;
    public _19_211_DesignAddAndSearchWordsDataStructure() {
        this.root = new TrieNode();
    }
    
    public void addWord(String word) {
        TrieNode current = root;
        for (char c : word.toCharArray()) {
            if (current.children[c-'a'] == null)
               current.children[c-'a'] = new TrieNode();
            
            current = current.children[c-'a'];
        }
        current.isWord = true;
    }
    
    public boolean search(String word) {
        return recur(0, word, root);
    }

    boolean recur (int i, String word, TrieNode current) {
        for (int j=i; j<word.length(); j++) {
            char c = word.charAt(j);
            
            if (c == '.') {

                for (int k=0; k<26; k++) {
                    if (current.children[k] != null &&
                        recur(j+1, word, current.children[k]))
                        return true;
                }
                return false;

            } else {
                if (current.children[c-'a'] == null)
                    return false;
            
                current = current.children[c-'a'];
            }            
        }
        return current.isWord;
    }
}
