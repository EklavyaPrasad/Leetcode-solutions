class Solution {
public:
    vector<int> findDisappearedNumbers(vector<int>& nums) {
        vector<int> ans;
        map<int,int> Map;
        
        for(int i=1;i<=nums.size();i++){
            Map[i];   
        }
        
        for(auto i: nums){
            auto it= Map.find(i);
            it->second+=1;
        }
        
        
        
        map<int,int> :: iterator i;
        for(i=Map.begin();i!=Map.end();i++){
            cout<<i->first<<"->"<<i->second<<endl;
            if(i->second==0) ans.push_back(i->first);
        }
        
        return ans;
    }
};