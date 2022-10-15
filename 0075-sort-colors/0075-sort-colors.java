class Solution {
    public void sortColors(int[] nums) {
        int a=0,b=0,c=0,ind=0;
        
        for(int i:nums){
            if(i==0) a++;
            else if(i==1) b++;
            else c++;
        }
        
        while(a-->0) nums[ind++]=0;
        while(b-->0) nums[ind++]=1;
        while(c-->0) nums[ind++]=2;
    }
}