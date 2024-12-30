class Solution {
    public int countGoodStrings(int low, int high, int zero, int one) {


       Integer dp[]=new Integer[high+1];

     return  check(0,low,high,zero,one,dp); 
    }


    public static int check(int i,int low,int high,int z,int o,Integer dp[] ){

        if(i>high){

            return 0;
        }

        if(dp[i]!=null){
            return dp[i];


        }
int ans=0;

        if(i>=low && i<=high){
ans=1;

        }

        ans=(ans+check(i+z,low,high,z,o,dp))%(1000000007);
        ans=(ans+check(i+o,low,high,z,o,dp))%(1000000007);

        return dp[i]=ans;
    
    }
}