class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length, n=mat[0].length;
        if(m*n==r*c){
            int [][]ans=new int[r][c];
            int a=0,b=0;
            
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    int temp=mat[i][j];
                    ans[a][b++]=temp;
                    if(b>=c){
                        a++;
                        b=0;
                    }
                }
            }
            return ans;
        }
        return mat;
    }
}