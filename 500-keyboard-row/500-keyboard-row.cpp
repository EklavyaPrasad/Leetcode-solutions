class Solution {
public:
    vector<string> findWords(vector<string>& words) {
        set<char> r1{'Q', 'W', 'E', 'R','T','Y','U','I','O','P','q','w','e','r','t','y','u','i','o','p'};
        set<char> r2{'A', 'S', 'D', 'F','G','H','J','K','L','a','s','d','f','g','h','j','k','l'};
        set<char> r3{'Z', 'X', 'C', 'V','B','N','M','z','x','c','v','b','n','m'};
        
        vector<string> ans;
        
        for(auto s : words){
            if(check1(s,r1) || check2(s,r2) || check3(s,r3)) ans.push_back(s);
        }
        return ans;
    }
    bool check1(string s,set<char> r1){
        
        for(int i=0;i<s.length();i++){
            if(!r1.count(s[i])) return false;
        }
        return true;
    }
    bool check2(string s,set<char> r2){
         for(int i=0;i<s.length();i++){
            if(!r2.count(s[i])) return false;
        }
        return true;
    }
    bool check3(string s,set<char> r3){
         for(int i=0;i<s.length();i++){
            if(!r3.count(s[i])) return false;
        }
        return true;
    }
};