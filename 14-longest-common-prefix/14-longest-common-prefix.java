class Solution {
    public String longestCommonPrefix(String[] strs) {
    
    StringBuilder ans=new StringBuilder();
        
    if(strs.length==0 || strs[0].isEmpty()) return "";
    else if(strs.length==1) return strs[0];
        
    boolean flag=true,isBreakedAtFirst=false;
    int index=0;
        
    while(flag){
        try{
            for(int i=0;i<strs.length-1;i++){
                if(strs[i].charAt(index)!=strs[i+1].charAt(index)) {
                    if(i!=0){
                       // ans.setLength(ans.length() - 1);
                       return ans.toString(); 
                    }
                    flag=false;
                    break;
                }
                if(i==strs.length-2) ans.append(strs[0].charAt(index));
            }
            index++;
            
        }catch(Exception e){
            return ans.toString();
        }
    }     
    return ans.toString();
    }
}