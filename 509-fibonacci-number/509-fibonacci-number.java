class Solution {
    public int fib(int n) {
        if(n==0) return 0;
        else if(n==1) return 1;
        
        int [] ans=new int[1];
        helper(0,1,n-1,ans);
        return ans[0];
    }
    void helper(int a,int b, int n, int [] ans){
        if(n==0){
            ans[0]=b;
            return;
        } 
        helper(b,a+b,n-1,ans);
    }
}