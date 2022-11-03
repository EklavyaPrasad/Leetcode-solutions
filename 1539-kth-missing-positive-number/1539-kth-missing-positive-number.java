class Solution {
    public int findKthPositive(int[] arr, int k) {
        int ans=0,ind=0;
        for(int i=1;i<arr[arr.length-1];i++){
            if(k!=0 && i!=arr[ind]){
                ans=i;
                k--;
            }else{
                ind++;
            }
            if(k==0) return ans;
        }
        return k==0 ? ans: arr[arr.length-1]+k ;
    }
}