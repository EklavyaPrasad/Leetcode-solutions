class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        solve(0,nums,ans);
        return ans;
    }
    
    void solve(int ind, int []nums, List<List<Integer>> ans){
        if(ind==nums.length){
            List<Integer> temp=new ArrayList<>();
            for(int i=0;i<nums.length;i++){
                temp.add(nums[i]);
            }
            ans.add(new ArrayList<>(temp));
            return;
        }
        
        for(int i=ind;i<nums.length;i++){
            swap(i,ind,nums);
            solve(ind+1,nums,ans);
            swap(i,ind,nums);
        }
    }
    void swap(int i, int j, int[] nums){
        int t=nums[i];
        nums[i]=nums[j];
        nums[j]=t;
    }
}