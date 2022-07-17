import java.util.SortedMap;
class Solution {
    public int minSetSize(int[] arr) {
        
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:arr){
            map.merge(i,1,Integer::sum);
        }
        List<Integer> l=new ArrayList<>(map.values());
        Collections.sort(l);
        int n=arr.length,count=n,ans=0;
        
        while(count>n/2){
            count-=l.get(l.size()-1);
            l.remove(l.size()-1);
            ans++;
        }
        return ans;
    }
}
