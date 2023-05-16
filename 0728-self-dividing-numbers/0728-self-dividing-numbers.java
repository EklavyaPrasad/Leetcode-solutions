class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans=new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(check(i)) ans.add(i);
        }
        return ans;
    }
    private static boolean check(int n){
        int m=n,r=0;
        
        while(m!=0){
            r=m%10;
            if(r==0) return false;
            // System.out.println(r +" "+n);
            if(n%r != 0) return false;
            m=m/10;
        }
        return true;
    }
    
}