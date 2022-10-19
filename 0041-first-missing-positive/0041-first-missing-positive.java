class Solution {
    public int firstMissingPositive(int[] nums) {
        boolean isOne=false;
        int n=nums.length;
        
        for(int i=0;i<n;i++){
            if(nums[i]==1) isOne=true;
            if(nums[i]<1 || nums[i]>n) nums[i]=1;
            
        }
        if(!isOne) return 1;
        for(int i=0;i<n;i++){
            int ind=Math.abs(nums[i]);
            nums[ind-1]=-Math.abs(nums[ind-1]);
        }
        for(int i=0;i<n;i++){
            if(nums[i]>0) return i+1;
        }
        return n+1;
    }
}