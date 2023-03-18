package March;

/**  
* 
*  @Sir Darey
* 
* LeetCode Daily Challenge, March 2023
* Day 18: Problem 1472 - Design Browser History
* 
*/


public class _18_1472_DesignBrowserHistory {
	
	class Node {
        Node prev, next;
        String val;

        public Node(String val) {
            this.val = val;
        }
    }

    Node head, current;
    
    public _18_1472_DesignBrowserHistory(String homepage) {
        this.head = new Node(homepage);
        this.current = head;
    }
    
    public void visit(String url) {
        current.next = null;
        Node newNode = new Node(url);
        current.next = newNode;
        newNode.prev = current;
        current = current.next;
    }
    
    public String back(int steps) {
        while (steps > 0 && current != head) {
            current = current.prev;
            steps--;
        }
        return current.val;
    }
    
    public String forward(int steps) {
        while (steps > 0 && current.next != null) {
            current = current.next;
            steps--;
        }
        return current.val;
    }
}
