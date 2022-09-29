class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length/3;
        System.out.println(n);
        int n1=0,n2=0,count1=0,count2=0;
        List<Integer> ans=new ArrayList<>();
          
        for(Integer it: nums){
            if(it==n1) 
                count1++;
            else if(it==n2) 
                count2++;
            else if(count1==0){
                n1=it;
                count1=1;
            }else if(count2==0){
                n2=it;
                count2=1;
            }else{
                count1--;
                count2--;
            }
        }
        System.out.println(n1+" "+n2);
        count1 = 0;
        count2 = 0;
        for(int it : nums) {
            if(it == n1)
                count1++;
            else if(it == n2)
                count2++;
        }
        if(count1 > n) ans.add(n1);
        if(count2 > n) ans.add(n2); 
        
        return ans;
        
    }
}