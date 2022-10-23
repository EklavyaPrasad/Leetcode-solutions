class Solution {
    public int[] plusOne(int[] digits) {
        int n=digits.length;
        if(n>1 && digits[n-1]<9){
            digits[n-1]+=1;
            return digits;
        }
        List<Integer> ans=new ArrayList<Integer>();
        boolean leadingOne=false,flag=false;
        for(int i=n-1;i>=0;i--){
            if(!flag)digits[i]++;
            if(digits[i]<=9){
                leadingOne=false;
                flag=true;
                ans.add(digits[i]);     
            }
            else{
                ans.add(0);
                leadingOne=true;
            }
        }
        if(leadingOne) ans.add(1);
        int dodo[]=new int[ans.size()];
        int ind=0;
        for(int i=ans.size()-1;i>=0;i--){
            dodo[ind++]=ans.get(i);
        }
        return dodo;
        
    }
}