class Solution {
    public boolean findSafeWalk(List<List<Integer>> grid, int health) {
        
int dp[][][]=new int[grid.size()][grid.get(0).size()][health+1];


        return check(grid,health,dp,0,0,1,grid.size(),grid.get(0).size());
    }


    public static boolean check(List<List<Integer> >l1,int h,int dp[][][],int i,int j,int t,int m,int n){
     
if(h==0){
    return false;
}



 if(i==-1 || i==m| j==-1 || j==n){
        return false;
     }
     if(l1.get(i).get(j)==1){
    h=h-1;
}
     if(i==m-1 && j==n-1  && h>=1){
        
        return true;
     }

    

 if(dp[i][j][h]==1){
        return false;
     }

 dp[i][j][h]=1;

    
    

     if(t==1){
        
         return  check(l1,h,dp,i+1,j,1,m,n)||check(l1,h,dp,i,j-1,-2,m,n)||check(l1,h,dp,i,j+1,2,m,n);
    
     }

    else if(t==2){
 return  check(l1,h,dp,i+1,j,1,m,n)||check(l1,h,dp,i-1,j,-1,m,n)||check(l1,h,dp,i,j+1,2,m,n);
     }

    else if(t==-1){
          return  check(l1,h,dp,i-1,j,-1,m,n)||check(l1,h,dp,i,j-1,-2,m,n)||check(l1,h,dp,i,j+1,2,m,n);
     }

   else  if(t==-2){
          return  check(l1,h,dp,i-1,j,-1,m,n)||check(l1,h,dp,i,j-1,-2,m,n)||check(l1,h,dp,i+1,j,1,m,n);
     }

     return false;
    }
}