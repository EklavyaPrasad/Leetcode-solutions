class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans=new LinkedList<>();
        
        ans.add(new ArrayList<>( Arrays.asList(1)));
        if(numRows==1) return ans;
        ans.add(new ArrayList<>( Arrays.asList(1,1)));
        if(numRows==2) return ans;
        
        int i=0,j=0;
        numRows=numRows-2;
        int n=2;
        
        while(numRows-->0){
            i=0;
            j=i+1;
            List<Integer> subList=new ArrayList<>();
            subList.add(1);
            
            while(j<n){
                subList.add( ans.get(n-1).get(i++) + ans.get(n-1).get(j++) );
            }
            subList.add(1);
            ans.add(subList);  
            n++;
        }
        return ans;
    }
}