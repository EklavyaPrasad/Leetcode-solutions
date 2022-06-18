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
    public void reorderList(ListNode head) {
        if(head.next==null) return;
        
//         HashMap<Integer,Integer> map=new HashMap<>();
//         ListNode temp=head;
//         int i=0;
//         while(temp!=null){
//             map.put(i++,temp.val);
//         }
        
//         temp=head;
//         i=0;
//         int n=map.size()-1;
        
//         boolean flag=true;
        
//         while(temp!=null){
//             if(flag){
//                 temp.val=map.get(i);
//                 i++;
//                 flag=false;
//             }else{
//                 temp.val=map.get(n-i);
//                 i++;
//                 flag=true;
//             }
//             temp=temp.next;    
//         }
        
        List<Integer> l=new ArrayList<>();
        int i=0,n=0;
        ListNode temp=head.next,last=head.next;
        boolean flag=true;
        
        while(last!=null){
            l.add(last.val);
            last=last.next;
            n++;
        }
        n--;
        while(temp!=null){
            if(flag){
                temp.val=l.get(n-i);
                flag=false;
            }else{
                temp.val=l.get(i);
                i++;
                flag=true;
            }
            temp=temp.next;
        }
        
    }
}