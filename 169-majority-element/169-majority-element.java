class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length/2;
        int majority=0,majority_count=0;
        
        for(Integer it: nums){
            if(majority_count==0)
                majority=it;
            if(it==majority)
                majority_count+=1;
            else 
                majority_count-=1;
        }
        return majority;
    }
}