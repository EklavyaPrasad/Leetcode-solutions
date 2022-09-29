class Solution {
    public int mostFrequentEven(int[] nums) {
        int hash[]=new int[100001];
        for(int it:nums) hash[it]++;
        int max=0,ans=Integer.MAX_VALUE;
        
        for(int i=0;i<100001;i++){
            if(i%2==0) max=Math.max(hash[i],max);
        }
        if(max==0) return -1;
        for(int i=0;i<100001;i++){
            if(i%2==0 && hash[i]==max) ans=Math.min(i,ans);
        }
        // System.out.println(max+"-"+ans);
        return ans;
        
    }
}