class Solution {
    public String reverseWords(String s) {
        String [] arr=s.split(" ");
        String ans="";
        
        for(String st:arr){
            ans+=helper(st) + " ";
        }
        int len=ans.length()-1;
        ans=ans.substring(0,len);
        return ans;
    }
    String helper(String s){
        String res="";
        for(int i=s.length()-1;i>=0;i--){
            res+=s.charAt(i);
        }
        return res;
    }
}