class Solution {
    public int pivotIndex(int[] nums) {
        int l=0,r=nums.length-1,lsum=0,rsum=0;

        while(r>l) rsum+=nums[r--];
        if(rsum==0) return 0;
        r++;
            
        while(lsum!=rsum){
            if(r==nums.length) return -1;
            lsum+=nums[l++];
            rsum-=nums[r++];     
        }
        return l;
    }
}