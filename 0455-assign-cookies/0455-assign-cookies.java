class Solution {
    public int findContentChildren(int[] g, int[] s) {
        if(s.length==0) return 0;
        Arrays.sort(g);
        Arrays.sort(s);
        
        int i=0,ind=0,count=0;
        
        while(i<g.length){
            if(g[i]<=s[ind]){
                count++;
                i++;
            }
            ind++;
            if(ind>=s.length) return count;
        }
        return count;
    }
}