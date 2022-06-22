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
    public ListNode removeNthFromEnd(ListNode head, int n) {
         ListNode temp=head;
        int size=0;
        while(temp!=null){
            temp=temp.next;
            size++;
        }
        
        if(size==1 && n==1) return null;
        if(size==n){
            head=head.next;
            return head;
        }
        int index=size-n-1;
        temp=head;
        while(index-->0){
            temp=temp.next;
        }
        ListNode node=temp.next.next;
        temp.next=node;
        return head;
    }
}