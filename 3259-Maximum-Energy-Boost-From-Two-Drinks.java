class Solution {
    public long maxEnergyBoost(int[] A, int[] B) {

        long dp[][]=new long [A.length][2];
return Math.max(ma(0,A,B,0,dp),ma(0,A,B,1,dp));

    }



public static long ma(int i,int A[],int B[],int t,long dp[][]){
    
    
    if(i>=A.length){
        return 0;
    }

    if(dp[i][t]!=0){
        return dp[i][t];
    }
  long ans1=0;
  long ans2=0;
    if(t==0){
       ans1= A[i]+ma(i+1,A,B,0,dp);
       ans2=A[i]+ma(i+2,A,B,1,dp);
      
    }

    long ans3=0;
    long ans4=0;
if(t==1){
ans3=B[i]+ma(i+1,A,B,1,dp);
ans4=B[i]+ma(i+2,A,B,0,dp);

}

return dp[i][t]=Math.max(Math.max(ans1,ans2),Math.max(ans3,ans4));
    

   
  
}



    }
        
