package May;

/**  
* 
*  @Sir Darey
* 
* LeetCode Daily Challenge, May 2023
* Day 16: Problem 24 - Swap Nodes in Pairs
*/

public class _16_24_SwapNodesInPairs {
	
	class ListNode {
		ListNode next;
		int val;
		
		public ListNode (int val) {
			this.val = val;
		}
	}
	
	public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null)
            return head;
        
        ListNode dummy = new ListNode(0),
                 current = head, 
                 prev = dummy,
                 temp;
        while (current != null && current.next != null) {
            temp = current.next;
            current.next = temp.next;
            temp.next = current;
            prev.next = temp;
            prev = current;
            current = current.next;
        }
        return dummy.next;
    }
}
