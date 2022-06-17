class Solution {
    public int[] sortedSquares(int[] nums) {
        int i=0,j=nums.length-1;
        int []ans=new int[j+1];
        
        for(int ind=j;ind>=0;ind--){
            if(Math.abs(nums[i])>Math.abs(nums[j])){
                ans[ind]=(int)Math.pow(nums[i],2);
                i++;
            }else{
                ans[ind]=(int)Math.pow(nums[j],2);
                j--;
            }
        }
        return ans;
    }
}