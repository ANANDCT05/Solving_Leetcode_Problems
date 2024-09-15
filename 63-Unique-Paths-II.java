class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        

        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;

        int dp[][]=new int [m][n];
 
      return calto(obstacleGrid,m,n,dp,0,0);
    }
public int calto(int [][] o,int m,int n,int[][]dp,int i,int j){

    if(i==m|| j==n){
        return 0;
    }
      if(o[i][j]==1){
        return 0;
    }
    if(i==m-1 && j==n-1){
        if(o[i][j]==1){
            return 0;
        }
        return 1;
    }

    
    if(dp[i][j]!=0){
        return dp[i][j];
    }

    return dp[i][j]=calto(o,m,n,dp,i,j+1)+calto(o,m,n,dp,i+1,j);

}

}