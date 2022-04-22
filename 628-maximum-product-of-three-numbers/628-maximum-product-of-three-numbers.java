class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int i=0,j=nums.length-1,ans=0;
        // boolean isFound=false;
        
        // while(!isFound){
            
            ans=nums[j]*nums[j-1]*nums[j-2];
            if(nums[i]<0 && nums[i+1]<0){
                ans=Math.max(ans,nums[i]*nums[i+1]*nums[j]);
            }
        // }
        return ans;
    }
}