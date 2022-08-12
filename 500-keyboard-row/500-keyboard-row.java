class Solution {
    public String[] findWords(String[] words) {
        
        HashSet<Character> r1=new HashSet<>(
            Arrays.asList('Q', 'W', 'E', 'R','T','Y','U','I','O','P','q','w','e','r','t','y','u','i','o','p'));
        HashSet<Character> r2=new HashSet<>(
            Arrays.asList('A', 'S', 'D', 'F','G','H','J','K','L','a','s','d','f','g','h','j','k','l'));
        HashSet<Character> r3=new HashSet<>(
            Arrays.asList('Z', 'X', 'C', 'V','B','N','M','z','x','c','v','b','n','m'));
        
        List<String> ans=new ArrayList<>();
        
        for(String s : words){
            if(check1(s,r1) || check2(s,r2) || check3(s,r3)) ans.add(s);
        }
        String []res = new String[ans.size()];
        ans.toArray(res);
        return res;
    }
    
    public boolean check1(String s,Set<Character> r1){
        for(Character c: s.toCharArray()){
            if(!r1.contains(c)) return false;
        }
        return true;
    }
    public boolean check2(String s,Set<Character> r2){
        for(Character c: s.toCharArray()){
            if(!r2.contains(c)) return false;
        }
        return true;
    }
    public boolean check3(String s,Set<Character> r3){
        for(Character c: s.toCharArray()){
            if(!r3.contains(c)) return false;
        }
        return true;
    }
    
}