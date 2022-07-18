class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int it:nums){
            int nod=helper(it);
            if(check(nod)) count++;
        }
        return count;
    }
    public static int helper(int n){
        return (int)Math.floor(Math.log10(n) + 1);
    }
    public static boolean check(int n){
        return (n&1) ==0;
    }
}