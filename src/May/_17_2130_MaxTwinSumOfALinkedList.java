package May;

/**  
* 
*  @Sir Darey
* 
* LeetCode Daily Challenge, May 2023
* Day 17: Problem 2130 - Maximum Twin Sum of a Linked List
* 
*/

public class _17_2130_MaxTwinSumOfALinkedList {
	
	class ListNode {
		ListNode next;
		int val;
		
		public ListNode (int val) {
			this.val = val;
		}
	}
	
	public int pairSum(ListNode head) {
        int max = 0;
        ListNode fast = head, slow = head, prev = null;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            ListNode temp = slow.next;
            slow.next = prev;
            prev = slow;
            slow = temp;
        }

        while (slow != null) {
            max = Math.max(max, (slow.val + prev.val));
            slow = slow.next;
            prev = prev.next;
        }
        return max;
    }
}
