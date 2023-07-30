package July.Random;

/**  
* 
*  @Sir Darey
* 
* LeetCode Problem 234 - Palindrome Linked List
* 
*/

public class _234_PalindromeLinkedList {
	
	private class ListNode {
		ListNode next;
		int val;
	}
	
	public boolean isPalindrome(ListNode head) {
        ListNode fast = head, slow = head, prev, temp;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        prev = slow; slow = slow.next;
        prev.next = null;
        while (slow != null) {
            temp = slow.next;
            slow.next = prev;
            prev = slow;
            slow = temp;
        }

        fast = head;
        while(prev != null) {
            if (fast.val != prev.val)
                return false;

            fast = fast.next;
            prev = prev.next;
        }
        return true;
    }
}
