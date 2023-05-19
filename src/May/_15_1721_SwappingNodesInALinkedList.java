package May;

/**  
* 
*  @Sir Darey
* 
* LeetCode Daily Challenge, May 2023
* Day 15: Problem 1721 - Swapping Nodes in a Linked List
*/

public class _15_1721_SwappingNodesInALinkedList {
	
	class ListNode {
		ListNode next;
		int val;
	}
	
	public ListNode swapNodes(ListNode head, int k) {
        ListNode current = head;
        int count=0;
        while(++count < k)
          current = current.next;      
        
        ListNode first = current;
        ListNode second = head;

        while(current.next!=null){
          current = current.next;      
          second = second.next;
        }

        int temp = first.val;
        first.val = second.val;
        second.val = temp;
        
        return head;
    }
}
