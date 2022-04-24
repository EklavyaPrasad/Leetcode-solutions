class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int max=1,ans=0;
        if(nums.length==1) return max;
        for(int i=0;i<nums.length-1;i++){
            
            if(nums[i]<nums[i+1]){
                max++;
            }else{
                ans=Math.max(ans,max);
                max=1;
            }
        }
        return ans>max?ans:max;
    }
}