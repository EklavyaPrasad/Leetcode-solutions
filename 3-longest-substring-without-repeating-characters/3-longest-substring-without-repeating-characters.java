class Solution {
    public int lengthOfLongestSubstring(String s) {
        int ascii[]=new int[256];
        int ans=0;
        
        for(int i=0,j=0;i<s.length();i++){
            j=(ascii[s.charAt(i)]>0) ? Math.max(j,ascii[s.charAt(i)]) : j;
            ascii[s.charAt(i)] =i+1;
            ans=Math.max(ans,i-j+1);
        }
        return ans;
    }
}