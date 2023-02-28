package February;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**  
* 
*  @Sir Darey
* 
* LeetCode Daily Challenge, February 2023
* Day 28: Problem 652 - Find Duplicate Subtrees
*/

public class _28_652_FindDuplicateSubtrees {
	
	class TreeNode {
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
	
	List<TreeNode> result = new ArrayList<>();
    Map<String, Integer> map = new HashMap<>();

    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        preOrder(root);
        return result;
    }

    public String preOrder(TreeNode current) {
        if (current == null) 
            return "*";  

        String values = current.val + ".";
        values += preOrder(current.left) + ".";;
        values += preOrder(current.right);

        map.put(values, map.getOrDefault(values, 0) + 1);
        if (map.get(values) == 2) 
            result.add(current);

        return values;
    }
}
