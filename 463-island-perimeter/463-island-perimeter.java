class Solution {
    public int islandPerimeter(int[][] grid) {
        
        int ans[]=new int[1];
        boolean vis[][]=new boolean[grid.length][grid[0].length];
        boolean flag=false;
        
        
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(!vis[i][j] && grid[i][j]==1){
                    solve(grid,i,j,vis,ans);
                    flag=true;
                    break;
                }
            }
            if(flag) break;
        }
        return ans[0];
    }
    void solve(int [][]grid,int r,int c,boolean vis[][],int []ans){
        if(r<0 || c<0 || r==grid.length || c==grid[0].length || grid[r][c]==0){
            ans[0]++;
            return;
        }else if(vis[r][c]){
            return;
        } 
        
        vis[r][c]=true;
      
        solve(grid,r-1,c,vis,ans);
        solve(grid,r,c-1,vis,ans);
        solve(grid,r+1,c,vis,ans);
        solve(grid,r,c+1,vis,ans);
        
    }
}