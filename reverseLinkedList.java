/* 206. Reverse Linked List
/*

public class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev=null,newHead=null;
        
        while(head != null)
        {
            prev = newHead;
            newHead = head;
            head = head.next;
            newHead.next = prev; 
        }
        return newHead;
    }
}
