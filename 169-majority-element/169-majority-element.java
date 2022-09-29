class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> hs=new HashMap<>();
        for(Integer it:nums){
            if(hs.containsKey(it)) hs.put(it,hs.get(it)+1);
            else hs.put(it,1);
            
        }
        for (var entry : hs.entrySet()) {
           if(entry.getValue()>nums.length/2) return entry.getKey();
        }
        return 0;
    }
}