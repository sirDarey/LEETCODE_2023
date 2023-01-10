package January;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @Sir Darey
 * 
 * LeetCode Daily Challenge, January 2023
 * Day 9: 144 - Binary Tree Preorder Traversal
 */

public class _9_144_BinaryTreePreorderTraversal {
    
    private class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
    }
    
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        recur(root, result);
        return result;
    }

    void recur(TreeNode root, List<Integer> result) {
        if (root == null)
            return;
        result.add(root.val);
        recur(root.left, result);
        recur(root.right, result);
    }
}
