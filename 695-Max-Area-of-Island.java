class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        

        int v[][]=new int[grid.length][grid[0].length];
   int max=0;
   int x[]={1,0,-1,0};
   int y[]={0,-1,0,1};
        for(int i=0;i<grid.length;i++ ){

            for(int j=0;j<grid[0].length;j++){

                if(grid[i][j]==1 && v[i][j]==0){
                    max=Math.max(max,check(grid,v,i,j,x,y));
                }
            }
        }

        return max;
    }


    public static int check(int [][]grid,int v[][],int i,int j,int x[],int y[]){

        if(i<0 || i==grid.length || j<0 || j==grid[0].length){
            return 0;
        }

        if(grid[i][j]==0){
            return 0;
        }
        if(v[i][j]==1){
            return 0;
        }
        v[i][j]=1;

        int c=0;

        for(int k=0;k<4;k++){

            c+=check(grid,v,i+x[k],j+y[k],x,y);
        }


        return c+1;
    }
}