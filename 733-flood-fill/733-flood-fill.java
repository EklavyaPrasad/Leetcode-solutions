class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        boolean vis[][]=new boolean [image.length][image[0].length];
        
        floodfill(image,image[sr][sc],sr,sc,newColor,vis);
        return image;
    }
    void floodfill(int arr[][],int o,int r,int c,int n,boolean vis[][]){
        if(r<0 || c<0 || r==arr.length || c==arr[0].length || arr[r][c]!=o || vis[r][c]==true){
            return;
        }
        vis[r][c]=true;
        arr[r][c]=n;
        floodfill(arr,o,r-1,c,n,vis);
        floodfill(arr,o,r,c-1,n,vis);
        floodfill(arr,o,r+1,c,n,vis);
        floodfill(arr,o,r,c+1,n,vis);
        vis[r][c]=false;
    }
}