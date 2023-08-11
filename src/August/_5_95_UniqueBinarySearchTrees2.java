package August;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**  
* 
*  @Sir Darey
* 
* LeetCode Daily Challenge, August 2023
* Day 5: Problem 95 - Unique Binary Search Trees II
* 
*/

public class _5_95_UniqueBinarySearchTrees2 {
	
	Map <Pair<Integer, Integer>, List<TreeNode>> dp = new HashMap<>();
    
    public List<TreeNode> generateTrees(int n) {
        return recur(1, n);
    }

    List<TreeNode> recur (int start, int end) {
        List <TreeNode> newNodes = new ArrayList<>();

        if (start > end) {
            newNodes.add(null);
            return newNodes;
        } 

        if (dp.containsKey(new Pair<>(start, end)))
            return dp.get(new Pair<>(start, end));
        

        for (int i=start; i<=end; i++) {
            List <TreeNode> leftSubTrees = recur(start, i-1);
            List <TreeNode> rightSubTrees = recur(i+1, end);

            for (TreeNode left : leftSubTrees)
                for (TreeNode right : rightSubTrees) {
                    newNodes.add(new TreeNode(i, left, right));
                }
        } 

        dp.put(new Pair<>(start, end), newNodes);
        return newNodes;
    }
}
