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
    public ListNode removeElements(ListNode head, int val) {
        if(head==null) return head;
        else if(head.next==null && head.val!=val) return head;
        else if(head.next==null && head.val==val) return null;
        
        ListNode temp=head.next,prev=head;
        while(temp!=null){
            if(temp.val==val){
              while(temp.next!=null && temp.next.val==val) temp=temp.next;
              prev.next=temp.next; 
              prev=prev.next;
              temp=prev;   
            }
            if(temp==null) break;
            prev=temp;
            temp=temp.next;   
        }
        if(head.val==val) head=head.next;
        return head;
    }
}