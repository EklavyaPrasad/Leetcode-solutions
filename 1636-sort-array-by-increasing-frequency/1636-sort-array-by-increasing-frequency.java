
class Solution {
    public int[] frequencySort(int[] nums) {
        
        HashMap<Integer,Integer> hs=new HashMap<>();
       for(Integer it:nums){
            hs.merge(it,1,Integer::sum);
        }
        List<Pair> l=new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry:hs.entrySet()){
            l.add(new Pair(entry.getKey(),entry.getValue()));
        }
        
        Comparator<Pair> comp1 = new Comp1();
        Collections.sort(l,comp1);
        
        // for(Pair p:l){
        //     System.out.println(p.key+" "+p.val);
        // }
        
        int ans[]=new int[nums.length];
        int ind=0;
        
        for(Pair p:l){
            for(int i=0;i<p.val;i++){
                ans[ind++]=p.key;
            }
        }
        return ans;
           
    }
    class Pair{
        int key;
        int val;
        
        public Pair(int key,int val){
            this.key=key;
            this.val=val;
        }
    }
    class Comp1 implements Comparator<Pair>{
        public int compare(Pair a, Pair b) {      
            if(a.val<b.val) return -1;
            else if(a.val>b.val) return 1;
            return (a.key>b.key)?-1:1;
        }
    }
}