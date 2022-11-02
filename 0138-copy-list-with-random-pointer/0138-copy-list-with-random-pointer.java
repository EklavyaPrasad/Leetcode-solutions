/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Node itr=head,front=null,copy=null;
        
        // Linking the deep nodes with the original Linkedlist
        while(itr!=null){
            front=itr.next;
            copy=new Node(itr.val);
            itr.next=copy;
            copy.next=front;
            itr=front;
        }
        
        // setting up the random pointers
        itr=head;
        while(itr!=null){
            if(itr.random!=null){
                itr.next.random=itr.random.next;
            }
            itr=itr.next.next;
        }
        
        // separating the deep nodes ll from original ll
        
        itr=head;
        Node dummy=new Node(0);
        copy=dummy;
        
        while(itr!=null){
            front=itr.next.next;
            copy.next=itr.next;
            itr.next=front;
            copy=copy.next;
            itr=front;
        }
        
        return dummy.next;
        
    }
}