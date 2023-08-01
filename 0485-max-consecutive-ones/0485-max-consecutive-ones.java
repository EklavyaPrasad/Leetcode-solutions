class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int count=0,ans=0,n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]!=0) count++;
            else{
                ans=Math.max(ans,count);
                count=0;
            }
        }
        return ans>count? ans:count;
    }
}