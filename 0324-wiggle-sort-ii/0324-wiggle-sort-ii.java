class Solution {
    public void wiggleSort(int[] nums) {
        PriorityQueue<Integer> q = new PriorityQueue<Integer>(Collections.reverseOrder());
        for(int i:nums) q.add(i);
        int i=1;
        while(i<nums.length){
            nums[i]=q.poll();
            i+=2;
        }
        i=0;
        while(i<nums.length){
            nums[i]=q.poll();
            i+=2;
        }
    }
}