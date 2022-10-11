class Solution {
    public boolean checkIfPangram(String sentence) {
        if(sentence.length()<26) return false;
        int arr[]=new int[26];
        for(Character c:sentence.toCharArray()){
            arr[c-'a']++;
        }
        for(int i:arr) if(i==0) return false;
        return true;
        
    }
}