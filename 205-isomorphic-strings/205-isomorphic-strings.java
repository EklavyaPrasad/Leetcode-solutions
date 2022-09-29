class Solution {
    public boolean isIsomorphic(String s, String t) {
        int size=s.length();
        int arr[]=new int[512];
        
        for(int i=0;i<size;i++){
            if(arr[s.charAt(i)] != arr[t.charAt(i)+256]) return false;
            arr[s.charAt(i)] = arr[t.charAt(i)+256] = i+1;
        }
        return true;
    }
}