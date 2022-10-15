class Solution {
    public void sortColors(int[] nums) {
        int l=0,m=0,r=nums.length-1;
        
        while(m<=r){
           if(nums[m]==0){
               swap(nums,l,m);
               l++;
               m++;
           }else if(nums[m]==1) m++;
            else{
                swap(nums,m,r);
                r--;
            }
        }
    }
    public void swap(int arr[],int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}