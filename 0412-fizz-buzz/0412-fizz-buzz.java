class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> ans=new ArrayList<>();
        for(int i=1;i<=n;i++){
            helper(i,ans);
        }
        return ans;
    }
    public void helper(int n,List<String> ans){
        if(n%3==0 && n%5==0) ans.add("FizzBuzz");
        else if(n%3==0) ans.add("Fizz");
        else if(n%5==0) ans.add("Buzz");
        else ans.add(String.valueOf(n));
        
    }
}