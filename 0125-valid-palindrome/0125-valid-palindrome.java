class Solution {
    public boolean isPalindrome(String s) {
        if(s.length()==0) return true;

        List<Character> arr=new ArrayList<>();
        for(Character c:s.toCharArray()){
            int temp=(int)c;
            if(temp >=65 && temp <=90 || temp>=97 && temp<=122) arr.add(Character.toLowerCase(c));
            if(temp>=48 && temp<=57) arr.add(c);
        }
        if(arr.size()==1) return true;
        int l=0,r=arr.size()-1;
        while(l<=r){
            if(arr.get(l) != arr.get(r)) return false;
            l++;
            r--;
        }
        return true;
    }
}