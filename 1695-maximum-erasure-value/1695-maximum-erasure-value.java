class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int l=0,r=0,ans=0,sum=0;
        
        HashSet<Integer> hs=new HashSet<>();
        for(;r<nums.length;r++){
            while(hs.contains(nums[r])){
                sum-=nums[l];
                hs.remove(nums[l++]);
            }
            hs.add(nums[r]);
            sum+=nums[r];
            ans=Math.max(ans,sum);
        }
        return ans;
    }
}