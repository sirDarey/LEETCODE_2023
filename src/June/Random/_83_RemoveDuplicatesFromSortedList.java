package June.Random;

/**  
* 
*  @Sir Darey
* 
* LeetCode Problem 83 - Remove Duplicates from Sorted List
* 
*/

public class _83_RemoveDuplicatesFromSortedList {
	
	private class ListNode {
		int val;
		ListNode next;
	}
	
	public ListNode deleteDuplicates(ListNode head) {
        if (head == null)
            return null;
        
        int currentVal = head.val;
        ListNode currentNode = head, nextNode = head.next;

        while(nextNode != null) {
            while (nextNode != null && nextNode.val == currentVal) {
                currentNode.next = nextNode.next;
                nextNode = currentNode.next;
            }
            currentNode = currentNode.next;
            if (currentNode == null) {
                nextNode = null;
            } else {
                nextNode = currentNode.next;
                currentVal  = currentNode.val;
            }
        }

        return head;
    }
}
