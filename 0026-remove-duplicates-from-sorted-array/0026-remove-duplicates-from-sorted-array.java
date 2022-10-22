class Solution {
    public int removeDuplicates(int[] nums) {
        SortedSet<Integer> hs=new TreeSet<>();
        for(int i:nums) hs.add(i);
        int ind=0;
        for(Integer i:hs) nums[ind++]=i;
        return hs.size();
    }
}