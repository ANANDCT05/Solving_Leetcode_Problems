class Solution {
    static int tot1=0;
    public int uniquePathsIII(int[][] grid) {
        tot1=0;
        int n=grid.length;
        int m=grid[0].length;
        int tot=m*n;
        int obs=0;
        int x=-1;
        int y=-1;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==-1){
                    obs++;
                }
                else if(grid[i][j]==1){
                    x=i;
                    y=j;
                }

            }
        }
int need=tot-obs;

     int r[]={1,-1,0,0};
     int c[]={0,0,1,-1 };
  check(x,y,0,r,c,need,grid,n,m);
  return tot1;
    }

   public static void  check(int i,int j,int b,int r[],int c[],int need,int grid[][],int n,int m){
      
      if(i<0 || j<0 || i==n || j==m){
        return;
      }
        int el=i*(m)+j;
        if((b &(1<<el) )>0){
            return;
        }
      

        if(grid[i][j]==-1){
            return;
        }
        b=b^(1<<el);
        if(grid[i][j]==2){
          
            if(Integer.bitCount(b)==need){
                tot1=tot1+1;
            }

            return;
        }

        for(int k=0;k<4;k++){
            int nx=i+r[k];
            int ny=j+c[k];

            check(nx,ny,b,r,c,need,grid,n,m);
        }

    b=b^(1<<el);
    return ;
    }
    
}