class Solution {
    public int[] searchRange(int[] nums, int target) {
        if(nums.length==0) return new int[]{-1,-1};
        if(nums.length==1){
            if(nums[0]!=target) return new int[]{-1,-1};
            else return new int[]{0,0};
        }
        boolean isFound=false;
        int l=0,r=nums.length-1,mid=0;
        
        while(l<=r){
            mid=l+(r-l)/2;
            if(nums[mid]<target) l=mid+1;
            else if(nums[mid]>target) r=mid-1;
            else{
                isFound=true;
                while(nums[r]!=target) r--;
                while(mid >=0 && nums[mid]==target) mid--;
                break;
            }
        }
        if(!isFound) return new int[]{-1,-1};
        int ans[]={mid+1,r};
        return ans;
        
    }
}