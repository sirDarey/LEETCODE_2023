package July.Random;

/**  
* 
*  @Sir Darey
* 
* LeetCode Problem 1379 - Find a Corresponding Node of a Binary Tree in a Clone of That Tree
* 
*/

public class _1379_FindACorrespondingNodeOfABinaryTreeInACloneOfThatTree {
	
	class TreeNode{
		TreeNode left, right;
		int val;
	}
	
	TreeNode result = null;
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        
        preorder(cloned, target);
        return result;
    }

    void preorder(final TreeNode cloned, final TreeNode target) {
        if (cloned == null)
            return;
        if(target.val == cloned.val){
            result = cloned;
            return;
        }
        
        if (result == null) preorder(cloned.left, target);
        if (result == null) preorder(cloned.right, target);
    }
}
