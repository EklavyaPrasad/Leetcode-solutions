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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null || head.next==null || k==1) return head;
        int count=0;
        
        ListNode begin=null;
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        begin=dummy;
        while(head!=null){
            count++;
            if(count%k==0){
                begin=reverse(begin,head.next);
                head=begin.next;
            }else{
                head=head.next;
            }
        }
        return dummy.next;
    }
    public ListNode reverse(ListNode begin, ListNode end){
        
        ListNode prev=begin,next=null;
        ListNode curr=begin.next,first=null;
        first=curr;
        while(curr!=end){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        begin.next=prev;
        first.next=curr;
        
        return first;
        
    }
    
}