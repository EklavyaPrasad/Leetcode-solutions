class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        
        transpose(matrix,n);
        reverseRow(matrix,n);  
    }
    public void transpose(int [][]a,int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                int temp=a[i][j];
                a[i][j]=a[j][i];
                a[j][i]=temp;
            }
        }       
    }
    public void reverseRow(int [][]a,int n){
        
        for(int i=0;i<n;i++){
            int l=0,r=n-1;
            
            while(l<r){
                int temp=a[i][l];
                a[i][l]=a[i][r];
                a[i][r]=temp;
                l++;
                r--;
            }
        }
    }
}