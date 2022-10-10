class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> ss=new Stack<>();
        Stack<Character> tt=new Stack<>();
        for(Character c:s.toCharArray()){
            if(c!='#') ss.push(c);
            else if (ss.size()!=0) ss.pop();
        }
        for(Character c:t.toCharArray()){
            if(c!='#') tt.push(c);
            else if(tt.size()!=0) tt.pop();
        }
        if(ss.size()!=tt.size()) return false;
        while(!ss.isEmpty()){
            if(ss.peek()!=tt.peek()) return false;
            ss.pop();
            tt.pop();
        }
        return true;
    }
}