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
    public boolean isPalindrome(ListNode head) {
        if(head.next==null) return true;
        
        int a=0,b=0;
        ListNode curr=head,prev=null;
        while(curr!=null){
            a*=10;
            a+=curr.val;
            
            curr=head.next;
            head.next=prev;
            
            prev=head;
            head=curr;
        }
        while(prev!=null){
            b*=10;
            b+=prev.val;
            
            prev=prev.next;
        }
        return a==b;
        
    }
}