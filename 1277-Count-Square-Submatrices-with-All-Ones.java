class Solution {
    public int countSquares(int[][] matrix) {
        
    int dp[][]=new int [matrix.length][matrix[0].length];
int fin=0;
    for(int i=0;i<matrix.length;i++){
        for(int j=0;j<matrix[0].length;j++){
            if(matrix[i][j]==0){
                dp[i][j]=0;
            }

            else {
                fin+=check( i, j,dp);
            }
        }
    }

    return fin;
       

    
    }



    public static int check(int i,int j,int dp[][] ){
        
        if(i-1<0){
            return dp[i][j]=1;
        }

        if(j-1<0){
            return dp[i][j]=1;
        }

    return dp[i][j]=1+  Math.min(dp[i-1][j-1],Math.min(dp[i-1][j],dp[i][j-1]));
    }
}