package June.Random;

import java.util.ArrayList;
import java.util.List;

/**  
* 
*  @Sir Darey
* 
* LeetCode Problem 94 - Binary Tree Inorder Traversal
*/

public class _94_BinaryTreeInorderTraversal {
	
	private class TreeNode {
		int val;
		TreeNode left, right;
	}
	
	List<Integer> result = new ArrayList<>();

    public List<Integer> inorderTraversal(TreeNode root) {
        inorder(root);
        return result;
    }

    void inorder(TreeNode node) {
        if (node == null)
            return;
        
        inorder(node.left);
        result.add(node.val);
        inorder(node.right);
    }
}
