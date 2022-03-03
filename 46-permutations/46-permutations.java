class Solution {
    public List<List<Integer>> permute(int[] nums) {
        boolean picked[]=new boolean[nums.length];
        List<List<Integer>> ans= new ArrayList<>();
        
        solve(nums,picked,ans,new ArrayList<>());
        return ans;
    }
    void solve(int[] nums, boolean []picked, List<List<Integer>> ans, List<Integer> ds){
        if(ds.size()==nums.length){
            ans.add(new ArrayList<>(ds));
            return;
        }
       
        for(int i=0; i<nums.length;i++){
             if(picked[i]==false){
                 ds.add(nums[i]);
                 picked[i]=true;
                 solve(nums,picked,ans,ds);
                 picked[i]=false;
                 ds.remove(ds.size()-1);
             }
           
        }
    }
}