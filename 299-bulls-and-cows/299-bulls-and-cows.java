class Solution {
    public String getHint(String secret, String guess) {
        int hash[]=new int[10];
        int temp=0,bulls=0,cows=0;
        
        for(int i=0;i<secret.length();i++){
            if(secret.charAt(i)==guess.charAt(i)){
                bulls++;
            }else{
                temp=secret.charAt(i)-'0';
                hash[temp]++;
            }
        }
        for(int i=0;i<secret.length();i++){
            if(secret.charAt(i)!=guess.charAt(i)){
                temp=guess.charAt(i)-'0';
                if(hash[temp]!=0){
                    cows++;
                    hash[temp]--;
                }
            }
        }
        String ans=bulls+"A"+cows+"B";
        return ans;    
    }
}