package January.Random;

import java.util.Stack;

/**
*
* @Sir Darey
* 
* LeetCode Problem 2487 - Remove Nodes From Linked List
*/

public class _2487_RemoveNodesFromLinkedList {
	
	private class ListNode {
      int val;
      ListNode next;
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	}
	
	public ListNode removeNodes(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        stack.push(head.val);

        ListNode current = head.next;
        while(current != null) {
            int currentVal = current.val;
            while(!stack.isEmpty() && currentVal > stack.peek())
                stack.pop();
            stack.push(currentVal);
            current = current.next;
        }

        current = new ListNode(stack.pop());

        while(!stack.isEmpty()) {
            ListNode newNode = new ListNode(stack.pop(), current);
            current = newNode;
        }

        return current;
    }
}
