class Solution {
    public int findLucky(int[] arr) {
        int frq[]=new int[501];
        for(int it:arr){
            frq[it]++;
        }
        for(int i=500;i>=1;i--){
            if(i==frq[i]) return i;
        }
        return -1;
    }
}