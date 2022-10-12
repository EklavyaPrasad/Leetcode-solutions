class Solution {
    public void setZeroes(int[][] matrix) {
        int rows=matrix.length,columns=matrix[0].length;
        boolean vis[][]=new boolean [rows][columns];
            
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                
                if(matrix[i][j]==0 && !vis[i][j])
                    helper(i,j,rows,columns,matrix,vis);
            }
        }
        
    }
    public void helper(int i,int j,int r,int c,int [][]matrix,boolean vis[][]){
        //for rows
        for(int ind=0;ind<c;ind++){
            if(matrix[i][ind]!=0){
                matrix[i][ind]=0;
                vis[i][ind]=true;
            }
        }
        
        //for columns
        for(int ind=0;ind<r;ind++){
            if(matrix[ind][j]!=0){
               matrix[ind][j]=0;
                vis[ind][j]=true; 
            } 
        }
    }
}