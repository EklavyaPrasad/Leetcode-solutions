class Solution {
    public int missingNumber(int[] nums) {
        int sum=0,n=nums.length;
        for(int i:nums) sum+=i;
        
        int tsum=(n*(n+1))/2;
        // System.out.println(sum+" "+tsum);
        return sum!=tsum ? tsum-sum: 0;
        
    }
}