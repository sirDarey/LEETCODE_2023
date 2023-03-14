package March.Random;

import java.util.ArrayList;
import java.util.List;

/**  
* 
*  @Sir Darey
* 
* LeetCode Problem 1758 - Minimum Changes To Make Alternating Binary String
*/

public class _109_ConvertSortedListToBinarySearchTree {
	
	public class ListNode {
	       int val;
	       ListNode next;
	       ListNode() {}
	       ListNode(int val) { this.val = val; }
	       ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	}
	
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
	
	
	
	public TreeNode sortedListToBST(ListNode head) {
        List<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        
        return recur(list, 0, list.size()-1);
    }

    TreeNode recur(List<Integer> list, int left, int right) {
        if (left > right)
            return null;

        int mid = (left + right)/2;
        TreeNode node = new TreeNode(list.get(mid));
        node.left = recur(list, left, mid-1);
        node.right = recur(list, mid+1, right);

        return node;
    }
}
