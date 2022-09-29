class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length/3;
        List<Integer> ans=new ArrayList<>();
           
//         int majority=0,majority_count=0;
//         for(Integer it: nums){
            
//             if(majority_count==0)
//                 majority=it;
            
//             if(it==majority){
//                 majority_count+=1;
//                 if(majority_count>n) ans.add(majority);
//             }      
//             else 
//                 majority_count-=1;
//         }
//         return ans;
        
        HashMap<Integer,Integer> hs=new HashMap<>();
        for(Integer it: nums){
            if(hs.containsKey(it)) hs.put(it,hs.get(it)+1);
            else hs.put(it,1);
        }
        for(Map.Entry<Integer,Integer> entry: hs.entrySet()){
            if(entry.getValue()>n) ans.add(entry.getKey());
        }
        return ans;
    }
}