class Solution {
    public int[] twoSum(int[] nums, int target) {
        if(nums.length==2) return new int[]{0,1};
        List<Pair> al=new ArrayList<>();
        
        for(int i=0;i<nums.length;i++){
            al.add(new Pair(nums[i],i));
        }
        Collections.sort(al,(a,b)->a.val-b.val);
        
        int l=0,r=nums.length-1;
        int ans[]=new int[2];
        
        while(l<r){
            if(al.get(l).val+al.get(r).val < target){
                l++;
            }else if(al.get(l).val+al.get(r).val > target){
                r--;
            }else{
                ans[0]=al.get(l).ind;
                ans[1]=al.get(r).ind;
                break;
            }
        }
        return ans;
    }
}
class Pair{
    int val,ind;
    public Pair(int val,int ind){
        this.val=val;
        this.ind=ind;
    }
}