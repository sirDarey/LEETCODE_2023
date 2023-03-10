package March;

/**  
* 
*  @Sir Darey
* 
* LeetCode Daily Challenge, March 2023
* Day 10: Problem 382 - Linked List Random Node
* 
*/


public class _10_382_LinkedListRandomNode {
	
	class ListNode {
       int val;
       ListNode next;
       ListNode(int x) {
           val = x;
           next = null;
       }
   }
	
	 ListNode head;
	    public _10_382_LinkedListRandomNode(ListNode head) {
	        this.head=head;
	    }
	    
	    public int getRandom() {
	        ListNode node = head;
	        int counter=0, res = 0;

	        while (node != null){
	            counter++;
	            if ((int)(Math.random()*counter) == 0) 
	                res=node.val;
	                
	            node=node.next;
	        }
	        return res;       
	    }
}
