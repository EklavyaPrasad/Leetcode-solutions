class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        if(arr.length==3){
            return ((arr[0]==arr[1]) && (arr[1]==arr[2]))?true:false;
        }
        
        int sum=0,avg=0;
        for(Integer it:arr) sum+=it;
        
        avg=sum/3;
        int part=0,counter=0;
        
        for(Integer it:arr){
            part+=it;
            if(part==avg){
                counter++;
                part=0;
            }
            if(counter==3){
               break;
            }
        }
        return counter==3 && sum%3==0;
    }
}