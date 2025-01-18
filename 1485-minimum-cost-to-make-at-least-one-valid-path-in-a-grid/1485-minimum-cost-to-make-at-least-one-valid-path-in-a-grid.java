class Solution {
    public int minCost(int[][] grid) {
       
       int ans[]=new int[]{0,0,0};
       PriorityQueue<int[]>p1=new PriorityQueue<>((a,b)->(a[2]-b[2]));
       p1.add(ans);

Integer d[][]=new Integer[grid.length][grid[0].length];
d[0][0]=0;
int x[]=new int[]{0,0,1,-1};
int  y[]=new int[]{1,-1,0,0};
       while(!p1.isEmpty()){
        int g[]=p1.poll();
        int i=g[0];
        int j=g[1];
        int di=g[2];
        for(int k=0;k<4;k++){

            int x1=i+x[k];
            int y1=j+y[k];
int c=0;
            if(x1>=0 && x1<grid.length && y1>=0 && y1<grid[0].length){
              if(grid[i][j]!=(k+1)){
   c=1;
              }
              if(d[x1][y1]==null || d[x1][y1]>(di+c)){
                d[x1][y1]=di+c;
                int anss[]=new int[]{x1,y1,di+c};
                p1.add(anss);
              }
            }
        }
       }


       return d[grid.length-1][grid[0].length-1];

    }
}