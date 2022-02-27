class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(nums);
        solve(0,ans,new ArrayList<>(),nums);
        return ans;
    }
    void solve(int ind,List<List<Integer>> ans,List<Integer> ds,int []nums){
        ans.add(new ArrayList<>(ds));
        for(int i=ind;i<nums.length;i++){
            if(i!=ind && nums[i]==nums[i-1]) continue;
            ds.add(nums[i]);
            solve(i+1,ans,ds,nums);
            ds.remove(ds.size()-1);
        }
    }
}