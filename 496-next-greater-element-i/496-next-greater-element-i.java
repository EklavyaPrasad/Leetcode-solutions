class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        int L1 = nums1.length,L2 = nums2.length;
        int ans[]=new int[L1];
        int ind=0;
        
        for(int i=0;i<L2;i++){
            map.put(nums2[i],i);
        }
        for(int i=0;i<L1;i++){
            for(int j=map.get(nums1[i]);j<L2;j++){
                if(nums2[j]>nums1[i]){
                   ans[ind++]=nums2[j];
                    break;
                }
                else if(j==L2-1){
                    ans[ind++]=-1;
                }
            }
        }
        return ans;
    }
}