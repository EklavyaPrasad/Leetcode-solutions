/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if(head.next==null) return null;
        else if(head.next.next==null){
            head.next=null;
            return head;
        }
        
        ListNode slow=head,fast=head,prev=head;
        while(fast.next!=null){
            fast=fast.next.next;
            prev=slow;
            slow=slow.next;
            if(fast==null) break;
        }
        
        prev.next=slow.next;
        return head;
    }
}