class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int maxArea[]=new int[1];
        int count[]=new int[1];
        boolean vis[][]=new boolean[grid.length][grid[0].length];
        
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(!vis[i][j] && grid[i][j]==1){
                    count[0]=0;
                    solve(grid,i,j,vis,maxArea,count);
                } 
            }
        }
        return maxArea[0];
        
    }
    void solve(int grid[][],int r,int c,boolean vis[][],int []maxArea,int []count){
        if(r<0 || c<0 || r==grid.length || c==grid[0].length || grid[r][c]==0 || vis[r][c]==true){
            return;
        }
        vis[r][c]=true;
        count[0]++;
        
        solve(grid,r-1,c,vis,maxArea,count);
        solve(grid,r,c-1,vis,maxArea,count);
        solve(grid,r+1,c,vis,maxArea,count);
        solve(grid,r,c+1,vis,maxArea,count);
        
        maxArea[0]=Math.max(maxArea[0],count[0]);
    }
}