class Solution {
    public int longestPalindrome(String s) {
        if(s.length()==1) return 1;
        int ans=0;
        HashSet<Character> hs=new HashSet<>();
        for(Character c:s.toCharArray()){
            if(hs.contains(c)) {
                hs.remove(c);
                ans++;
            }
            else hs.add(c);
        }
        ans*=2;
        return hs.size()==0? ans:ans+1;
    }
}