class Solution {
    public int[] sortByBits(int[] arr) {
        List<Pair> l=new ArrayList<>();
        for(int i:arr) l.add(new Pair(i,countBits(i)));
        
        Collections.sort(l, (pair1,pair2) -> pair1.val == pair2.val ? pair1.key - pair2.key : pair1.val - pair2.val);
        int ind=0;
        int ans[]=new int[arr.length];
        for(Pair p:l) ans[ind++]=p.key;
        
        return ans;
    }  
    private int countBits(int n){
        String s=Integer.toBinaryString(n);
        int count=0;
        for(Character c:s.toCharArray()){
            if(c=='1')count++;
        }
        return count;
    }
}
class Pair{
    int key,val;
    public Pair(int key,int val){
        this.key=key;
        this.val=val;
    }
}