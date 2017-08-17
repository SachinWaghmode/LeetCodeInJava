/*
Merge two sorted linked lists and return it as a new list.
The new list should be made by splicing together the nodes of the first two lists.
*/

public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
       
        if( l1 == null )
            return l2;
        else if( l2 == null)
            return l1;
        
        if( l1.val < l2.val ){
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        }
        else{
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }
}

/* Iterative Solution was exceeding time limit
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = null, temp = null;
        
        if( l1 == null )
            return l2;
        else if( l2 == null)
            return l1;
        
       
        if( l1.val <= l2.val )
            head = l1;
        else 
            head = l2; 
        
        temp = head; 
        
        while(l1 != null && l2 !=null)
        {
            if( l1.val > l2.val)
            {
                temp.next = l2;
                l2 = l2.next;
            }
            else if( l1.val <= l2.val)
            {
                temp.next = l1;
                l1 = l1.next;
            }
            
            temp = temp.next;
        }
        
        if( l1 == null && l2 != null)
            temp.next = l2;
        else if( l2 == null && l1 != null)
            temp.next = l1;
        
        head = head.next;
        return head;
        
    }
}
*/
