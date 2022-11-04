class Solution {
    public int maximumWealth(int[][] accounts) {
        int sum=0,ans=0;
        for(int []a:accounts){
            sum=0;
            for(int i:a) sum+=i;
            ans=Math.max(ans,sum);
        }
        return ans;
    }
}