/* 83. Remove Duplicates from Sorted List

Given a sorted linked list, delete all duplicates such that each element appear only once.

For example,
Given 1->1->2, return 1->2.
Given 1->1->2->3->3, return 1->2->3.
*/

public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head, prev=null;
        
        if (head == null || head.next == null)
            return head;
        prev = temp;
        while (temp.next != null)
        {
            temp = temp.next;
            if ( temp.val != prev.val)
            {
                prev.next = temp;
                prev = temp;
            }                 
        }
        if (temp.val == prev.val)
             prev.next = null;    
        return head;
    }
}


/* Recursive Solution

public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null)return head;
        head.next = deleteDuplicates(head.next);
        return head.val == head.next.val ? head.next : head;
}
*/
