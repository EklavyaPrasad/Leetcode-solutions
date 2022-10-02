class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length()==0 && t.length()==0) return true;
        else if(s.length()==0 && t.length()!=0) return true;
        else if(s.length()!=0 && t.length()==0) return false;
        int i=0,j=0;
        while(i<s.length()){
            
            if(s.charAt(i)!=t.charAt(j)){
                j++;
            }else{
                i++;
                j++;
            }
            
            if(i!=s.length() && j==t.length()) return false;
        }
        return true;
    }
}