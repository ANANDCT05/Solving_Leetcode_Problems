class Solution {
    public int minFallingPathSum(int[][] grid) {
        
            int dp[][]=new int[grid.length][grid[0].length];
       

       for(int i=0;i<grid[0].length;i++){
        dp[grid.length-1][i]=grid[grid.length-1][i];
       }
          

          for(int i=grid.length-2;i>=0;i--){

            for(int j=0;j<grid[0].length;j++){
int min=Integer.MAX_VALUE;
                for(int k=0;k<grid[0].length;k++){
                    if(k!=j){
                        
                       min=Math.min(min,dp[i+1][k]); 
                       
                    }
                }

                dp[i][j]=grid[i][j]+min;
            }
          }

        int min=Integer.MAX_VALUE;

        for(int i=0;i<grid[0].length;i++){
            min=Math.min(min,dp[0][i]);
        }
        return min;
    }
}