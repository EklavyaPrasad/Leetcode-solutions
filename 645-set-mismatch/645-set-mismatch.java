class Solution {
    public int[] findErrorNums(int[] nums){
        
        int[] ans=new int[2];
        Set<Integer> set=new HashSet<>();
        
        //for repeating number
        for(int i=0;i<nums.length;i++){
            if(!set.contains(nums[i])){
                set.add(nums[i]);
            }else{
                ans[0]=nums[i];
            }
        }
        
        //for missing number
        for(int i=1;i<=nums.length;i++){
            if(!set.contains(i)){
                ans[1]=i;
            }
        }
        return ans;
    }
}