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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left==right) return head;
        
        ListNode p1=null,p2=null,l=head,r=null,itr=head,ll=null,rr=null;
        
        for(int i=0;i<left-1;i++) itr=itr.next;
        ll=itr;
        for(int i=0;i<right-left;i++) itr=itr.next;
        rr=itr;
         
        // System.out.println(ll+" "+rr);
        
        while(l!=ll){
            p1=l;
            l=l.next;
        }
        
        itr=l;
        while(itr!=rr){
            p2=itr.next;
            itr.next=r;
            
            r=itr;
            itr=p2;
        }
        
        p2=p2.next;
        itr.next=r;
        r=itr;
        
        if(p1!=null) p1.next=r;
        else head=r;
        l.next=p2;
        
        return head;
    }
}