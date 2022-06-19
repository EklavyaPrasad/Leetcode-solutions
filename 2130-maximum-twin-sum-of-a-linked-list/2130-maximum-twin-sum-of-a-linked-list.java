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
    public int pairSum(ListNode head) {
        if(head.next.next==null){
            return head.val+head.next.val;
        }
        int ans=0;
        
        ListNode slow=head,fast=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        
        ListNode nextNode=null,prevNode=null;
        while(slow!=null){
            nextNode=slow.next;
            slow.next=prevNode;
            prevNode=slow;
            slow=nextNode;
        }
        
        while(prevNode!=null){
            ans=Math.max(ans,head.val+prevNode.val);
            head=head.next;
            prevNode=prevNode.next;
        }
        return ans;
        
        
    }
}