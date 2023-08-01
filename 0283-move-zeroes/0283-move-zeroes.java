class Solution {
    public void moveZeroes(int[] nums) {
        
        //finding first zero
        int j=-1,n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                j=i;
                break;
            }
        }
        if(j==-1) return;
        
        // swapping non-zero digits with 0s
        
        for(int i=j+1;i<n;i++){
            if(nums[i]!=0){
                nums[j]=nums[i];
                nums[i]=0;
                j++;
            }
        }
        
    }
}