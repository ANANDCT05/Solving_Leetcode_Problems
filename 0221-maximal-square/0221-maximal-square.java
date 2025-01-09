class Solution {
    public int maximalSquare(char[][] matrix) {
        

        int dp[][]=new int[matrix.length][matrix[0].length];
int max=0;
int len=matrix.length;
int l=matrix[0].length;

        for(int i=0;i<len;i++){
            for(int j=0;j<l;j++){

                if(i==0 || j==0){
           dp[i][j]= matrix[i][j]-'0';
                }

                else if(matrix[i][j]=='1'){
      dp[i][j]=Math.min(Math.min(dp[i-1][j],dp[i][j-1]),dp[i-1][j-1])+1;
                }
                max=Math.max(dp[i][j],max);
            }
        }

        return max*max;
    }
}