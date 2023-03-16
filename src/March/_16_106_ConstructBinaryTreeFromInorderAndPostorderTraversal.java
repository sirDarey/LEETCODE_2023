package March;

import java.util.HashMap;
import java.util.Map;

/**  
* 
*  @Sir Darey
* 
* LeetCode Daily Challenge, March 2023
* Day 16: Problem 106 - Construct Binary Tree from Inorder and Postorder Traversal
* 
*/


public class _16_106_ConstructBinaryTreeFromInorderAndPostorderTraversal {
	
	public class TreeNode {
		       int val;
		       TreeNode left;
		       TreeNode right;
		       TreeNode() {}
		       TreeNode(int val) { this.val = val; }
		       TreeNode(int val, TreeNode left, TreeNode right) {
		           this.val = val;
		           this.left = left;
		           this.right = right;
		       }
	 }
	
	int p;
    Map<Integer, Integer> map = new HashMap<>();

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        p = postorder.length-1;
        
        for (int i=0; i<=p; i++) 
            map.put(inorder[i], i);
        
        return buildTree(0, p, postorder);
    }

    TreeNode buildTree(int left, int right, int[] postorder) {
        if (left > right) 
            return null;

        TreeNode node = new TreeNode(postorder[p]);
        int idx = map.get(postorder[p]);
        p--;

        node.right = buildTree(idx + 1, right, postorder);
        node.left = buildTree(left, idx - 1, postorder);
        
        return node;
    }
}
