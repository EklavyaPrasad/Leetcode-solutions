class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n=nums.length;
        if(n==1) return nums[0];
        n/=2;
        
        int i=0,j=1;
        while(n-->0){
            if((nums[i] ^ nums[j]) != 0) return nums[i];
            else{
                i+=2;
                j+=2;
            }
        }
        return nums[nums.length-1];
    }
}