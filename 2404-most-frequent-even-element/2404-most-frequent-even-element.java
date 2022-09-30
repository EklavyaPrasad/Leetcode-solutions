class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer,Integer> hs=new HashMap<>();
        int val=1000000,freq=0;
        
        for(int i:nums){
            if(i%2==0){
                
                int curr=hs.getOrDefault(i, 0)+1;
                hs.put(i,curr);
                if(curr>freq || curr==freq && i<val){
                    val=i;
                    freq=curr;
                }
            }
        }
        return freq==0? -1:val;
    }
}