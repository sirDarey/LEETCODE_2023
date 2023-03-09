package March;

/**  
* 
*  @Sir Darey
* 
* LeetCode Daily Challenge, March 2023
* Day 8: Problem 142 - Linked List Cycle II
* 
*/


public class _9_142_LinkedListCycleII {
	
	class ListNode {
       int val;
       ListNode next;
       ListNode(int x) {
           val = x;
           next = null;
       }
   }
	
	public ListNode detectCycle(ListNode head) {
        if (head == null)
            return null;

        ListNode slow = head, fast = head;
        while (fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            
            if (fast == slow){
                ListNode cycleCheck = head; 
                while (cycleCheck != slow){
                    slow = slow.next;
                    cycleCheck = cycleCheck.next;
                }
                return cycleCheck;
            }
        }
        return null;
    }
}
