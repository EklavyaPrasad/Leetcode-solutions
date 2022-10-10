class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String []arr=text.split(" ");
        int ans=0;

        for(String st:arr){
            if(solve(st,brokenLetters)) ans++;
        }
        return ans;
    }
    private boolean solve(String s,String bl){
        int hash[]=new int[26];
        for(Character c:s.toCharArray()){
            hash[c-'a']++;
        }
        for(Character c:bl.toCharArray()){
            if(hash[c-'a'] !=0 ) return false;
        }
        return true;
    }
}