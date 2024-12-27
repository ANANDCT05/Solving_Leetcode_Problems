class Solution {
    public int minOperations(int n) {

     Integer dp[]=new Integer[n+1];
     dp[1]=1;
     dp[0]=0;

     return check(n, dp);
    }

    public static int check(int i,Integer dp[]){
        if(dp[i]!=null){

            return dp[i];
        }

        double d=(Math.log(i)/Math.log(2));

        int e=(int)d;
        if(d-e==0){

            return 1;
        }

        double s=Math.pow(2,e);
        double s2=Math.pow(2,e+1);
      int d1= (int)(i-s);
      int d2=(int)(s2-i);
      return 1+Math.min(check(d1,dp),check(d2,dp));
    }



}