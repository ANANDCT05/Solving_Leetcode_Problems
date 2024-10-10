class Solution {
    public int maxScore(List<List<Integer>> grid) {
        
   int r=grid.size();
        int ma=Integer.MIN_VALUE;
        int g[][]=new int[101][r];


        for(int i=0;i<r;i++){
        for(int v:grid.get(i)){

            g[v][i]=1;
            ma=Math.max(ma,v);
        }

        }

    int max=(int)(Math.pow(2.0,r));
    int dp[][]=new int [ma+1][max];
  

    for(int i[]:dp){
      Arrays.fill(i,-1);
    }
   return check(1,dp,r,0,g,ma);   
    }

    public static int check(int i,int dp[][],int r,int s,int g[][],int ma){
        if(i>ma){
          return 0;
        }

        if(dp[i][s]!=-1){
            return dp[i][s];
        }
   int flag=0;
   int val=0;
        for(int k=0;k<r;k++){
            if(g[i][k]==1){
              
                if((s & (1<<k)) ==0){
                    
                   val=Math.max(val, check(i+1,dp,r,s^(1<<k),g,ma)+i);
                   
                }
                
                   
                

                
            } }
  val=Math.max(val,check(i+1,dp,r,s,g,ma));


        
   return dp[i][s]=val;

    }
}