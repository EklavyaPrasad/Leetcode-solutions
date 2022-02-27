class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        solve(0,ans,new ArrayList<>(),nums);
        return ans;
    }
    void solve(int ind,List<List<Integer>> ans,List<Integer> ds,int []nums){
       if(ind==nums.length){
           ans.add(new ArrayList<>(ds));
           return;
       }
        
        ds.add(nums[ind]);
        solve(ind+1,ans,ds,nums);
        ds.remove(ds.size()-1);
        solve(ind+1,ans,ds,nums);
    }
}