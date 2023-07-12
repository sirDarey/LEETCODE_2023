package July.Random;

/**  
* 
*  @Sir Darey
* 
* LeetCode Problem 1290 - Convert Binary Number in a Linked List to Integer
*/

public class _1290_ConvertBinaryNumInALinkedListToInteger {
	
	private class ListNode {
		ListNode next;
		int val;
	}
	
	public int getDecimalValue(ListNode head) {
        int count = 0;
        ListNode current = head;
        int decimal = 0;

        while (current != null) {
            current = current.next;
            count++;
        }

        current = head;
        while (--count >= 0) {
            decimal += current.val * Math.pow(2, count);
            current = current.next;
        }

        return decimal;
    }
}
