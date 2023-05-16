class Solution {
    public int strStr(String haystack, String needle) {
        int i=0,j=0,index=0;
        
        while(j!=needle.length()) j++;
        
        while(j<=haystack.length()){
            if(haystack.substring(i,j).equals(needle))return index;
            else{
                System.out.println(haystack.substring(i,j) +" "+i+" "+j);
                i++;
                j++;
                index++;
            }
        }
        if(j>haystack.length()) return -1;
        else return index;
        
    }
}