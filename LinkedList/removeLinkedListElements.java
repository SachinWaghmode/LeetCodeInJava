/* Remove Linked List Elements
Remove all elements from a linked list of integers that have value val.

Example
Given: 1 --> 2 --> 6 --> 3 --> 4 --> 5 --> 6, val = 6
Return: 1 --> 2 --> 3 --> 4 --> 5
*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode prev=null,temp=head;
        if (head == null || (head.next == null && head.val == val))
            return null;
        
        while(temp.next!=null)
        {
            if(temp.val == val && prev == null)
            {
                head = temp.next;
            }
            else if(temp.val == val)
            {
                prev.next = temp.next;
            } 
            else{
                 prev = temp;
            }
           
            temp = temp.next;
        }
        if(temp.val == val ){
             if (prev!=null)
             {
                prev.next = null;
             }
            else if (prev == null)
                head = null;
        }
        return head;
    }
}

/* Recursive solution
public ListNode removeElements(ListNode head, int val) {
        if (head == null) return null;
        head.next = removeElements(head.next, val);
        return head.val == val ? head.next : head;
}
*/
