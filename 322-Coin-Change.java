class Solution {
    public int coinChange(int[] coins, int amount) {
        Arrays.sort(coins);

        int dp[][]=new int[coins.length][100001];
  int v= check(coins,amount,coins.length-1,dp);
  if(v==100000){
    return -1;
  }
  return v;

    }

    public int check(int[]coins,int amount ,int i,int dp[][]){
        if(amount==0){
            return 0;
        }

        if(i==-1 ){
            if(amount==0){

            return 0;
            }
            else{
                return 100000;
            }
        }
        if(dp[i][amount]!=0){
            return dp[i][amount];
        }

        int p=amount/coins[i];

        int v=0;
int m=Integer.MAX_VALUE;
        for(int j=0;j<=p;j++){
            v=coins[i]*j;
m=Math.min(check(coins,amount-v,i-1,dp)+j,m);

        }

        return dp[i][amount]=m;
    }
}