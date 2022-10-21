/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* reverseBetween(ListNode* head, int left, int right) {
        if(left==right) return head;
        
        ListNode *p1,*p2,*l=head,*r,*itr=head,*m,*n;
        
        for(int i=0;i<left-1;i++) itr=itr->next;
        m=itr;
        for(int i=0;i<right-left;i++) itr=itr->next;
        n=itr;

        while(l!=m){
            p1=l;
            l=l->next;
        }
        
        itr=l;
        while(itr!=n){
            p2=itr->next;
            itr->next=r;
            
            r=itr;
            itr=p2;
        }
        
        p2=p2->next;
        itr->next=r;
        r=itr;
        
        if(p1!=NULL) p1->next=r;
        else head=r;
        l->next=p2;
        
        return head;
    }
};