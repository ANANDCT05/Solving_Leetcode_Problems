class Solution {
     int dp[][];
    public int minFallingPathSum(int[][] matrix) {

 dp=new int [matrix.length][matrix[0].length];
       int ans=10001;
    for(int i[]:dp){
Arrays.fill(i,-101);
    }
    for(int i=0;i<matrix[0].length;i++){

       ans= Math.min(ans,check(0,i,matrix));
    }
return ans;
    }

    public  int check(int i,int j,int matrix[][]){

        if(j<0 || j==matrix[0].length){
            return 10001;
        }
        if(i==matrix.length-1){
            return matrix[i][j];
     
        }

        if(dp[i][j]!=-101){
            return dp[i][j];
        }

        return dp[i][j] = matrix[i][j]+Math.min(Math.min(check(i+1,j-1,matrix),check(i+1,j,matrix)),check(i+1,j+1,matrix));
    }
}