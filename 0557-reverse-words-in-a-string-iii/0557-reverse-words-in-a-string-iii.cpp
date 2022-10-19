class Solution {
public:
    string reverseWords(string s) {
        string str="",ans="";
        
        for(int i=0;i<s.length();i++){
            
            if(i==s.length()-1){
                str+=s[i];
                ans+=helper(str);
                str="";
            }
            
            if(s[i]!=' ')str+=s[i];
            else{
                ans+=helper(str);
                ans+=" ";
                str="";
            }
        }
        return ans;
        
    }
    string helper(string& str){
    string temp="";
    for(int i=str.length()-1;i>=0;i--){
        temp+=str[i];
    }
    return temp;
    }
};