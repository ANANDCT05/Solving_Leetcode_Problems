class Solution {
    public int closedIsland(int[][] grid) {
    int n=grid.length;
    int m=grid[0].length;
int v[][]=new int[n][m];

       for(int i=0;i<m;i++){
        if(grid[0][i]==0 && v[0][i]==0){
            dfs(0,i,grid,v);
        }
        if(grid[n-1][i]==0 && v[n-1][i]==0){
            dfs(n-1,i,grid,v);
        }
       }
       
       for(int j=1;j<n-1;j++){
        if(grid[j][0] ==0 && v[j][0]==0){
            dfs(j,0,grid,v);
        }
        if(grid[j][m-1]==0 && v[j][m-1]==0){
            dfs(j,m-1,grid,v);
        }
       }
int count=0;
       for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            if(grid[i][j]==0 && v[i][j]==0){
                count++;
                dfs(i,j,grid,v);
            }
        }
       }

       return count;
    }

    public static void dfs(int i,int j,int grid[][],int v[][]){

        if(i<0 || j<0 || i==grid.length || j==grid[0].length || grid[i][j]==1 || v[i][j]==1){
            return;
        }
        v[i][j]=1;

    int ro[]={-1,1,0,0};
    int co[]={0,0,-1,1};
    for(int k=0;k<4;k++){
        dfs(i+ro[k],j+co[k],grid,v);
    }

    }
}