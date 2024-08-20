class Solution {
    public static Integer dp[][];
    public static Integer dp2[][];
    public int stoneGameII(int[] piles) {
        int size = piles.length;
   dp = new Integer[size][size+1];
    dp2 = new Integer[size][size+1];
   
   return check(1,piles,1,0);
}

public static int check(int t,int []p,int m,int i){

    if(i>=p.length){
        return 0;
    }

    if(t==1){
    if(dp[i][m]!=null){
    return dp[i][m];
}
        int f=2*m;
        int c=1;
        int ans=Integer.MIN_VALUE;
        int sum=0;
        int j=i;
        while(c<=f){
           m=Math.max(m,c);
         if(j<p.length){
            sum=sum+p[j];
            int e=check(0,p,m,i+c);
            ans=Math.max(sum+e,ans);
            j++;
         }
         else{
            break;
         }
        
         c++;
        }
        return dp[i][f/2]=ans;
        
    }


    if(t==0){
        if(dp2[i][m]!=null){
            return dp2[i][m];
        }
        int f=2*m;
        int c=1;
        int ans=Integer.MAX_VALUE;
        
        
    
       while(c<=f){
           m=Math.max(m,c);
         int sum=check(1,p,m,i+c);
          ans=Math.min(ans,sum);
          c++;
       }
return dp2[i][f/2]=ans;
    }

    return 0;
}
}