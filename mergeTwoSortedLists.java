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

/* Iterative Solution 
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    ListNode head = new ListNode(0);
    ListNode r=head;
 
    ListNode p1=l1;
    ListNode p2=l2;
    while(p1!=null && p2!=null){
        if(p1.val < p2.val){
            r.next = p1;
            p1 = p1.next;
        }else{
            r.next = p2;
            p2 = p2.next;
        }
        r=r.next;
    }
 
    if(p1!=null){
        r.next = p1;
    }
 
    if(p2!=null){
        r.next = p2;
    }
    return head.next;
}
}


*/
