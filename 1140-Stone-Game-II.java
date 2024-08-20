class Solution {
    public int stoneGameII(int[] piles) {
        int tot=0;

        for(int i=0;i<piles.length;i++){
            tot=tot+piles[i];
        }

        int m=1;
        int t=1;
int dp[][]=new int[piles.length][piles.length*2];
int dp2[][]=new int[piles.length][piles.length*2];
       int a= check(piles,t,m,0,dp,dp2);
       return tot-a;
    }


    public static int check(int piles[],int t,int m,int i,int[][]dp,int dp2[][]){
     

     if(i>=piles.length){
        return 0;
     }


     if(t==1){
        int l=m;
        if(dp2[i][l]!=0){
            return dp2[i][l];
        }
     
       
        int ma=2*m;
        int c=1;
        int min=Integer.MAX_VALUE;
        while(c<=ma){
         m=Math.max(c,m);
         int ans=check(piles,0,m,i+c,dp,dp2);
         min=Math.min(ans,min);
         c++;
        }

        return dp2[i][l]=min;
     }

     if(t==0){

        if(dp[i][m]!=0){
            return dp[i][m];
        }
      int l=m;
       int ma=2*m;
       int c=1;
       int sum=0;
       int max=Integer.MIN_VALUE;
       int j=i;
       int ans=0;
       while(c<=ma){
        m=Math.max(c,m);
       if(j<piles.length){
      sum=sum+piles[j];
      ans=check(piles,1,m,i+c,dp,dp2);

      max=Math.max(sum+ans,max);

      j++;
       }
       c++;
       }

    
return dp[i][l]=max;
     }

     return 0;
    }

    

}