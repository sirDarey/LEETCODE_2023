package June.Random;

import java.util.ArrayList;
import java.util.List;

/**  
* 
*  @Sir Darey
* 
* LeetCode Problem 145 - Binary Tree Postorder Traversal
*/

public class _145_BinaryTreePostorderTraversal {
	
	private class TreeNode {
		int val;
		TreeNode left, right;
	}
	
	List<Integer> result = new ArrayList<>();

    public List<Integer> postorderTraversal(TreeNode root) {
        postOrder(root);
        return result;
    }

    void postOrder(TreeNode node) {
        if (node == null)
            return;
        
        postOrder(node.left);
        postOrder(node.right);
        result.add(node.val);
    }
}
