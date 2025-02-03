class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
      int n=grid.length;
      int v[][]=new int[n][n];
      for(int a[]:v){
        Arrays.fill(a,-2);
      }
      if(grid[0][0]==1){
        return -1;
      }
      v[0][0]=0;
      Queue<int[]>q1=new LinkedList<>();
      q1.add(new int[]{0,0});
int ro[]={-1,1,0,0,1,1,-1,-1};
int co[]={0,0,-1,1,1,-1,-1,1};
      while(!q1.isEmpty()){
        int arr[]=q1.poll();
        for(int i=0;i<8;i++){
            int nx=arr[0]+ro[i];
            int ny=arr[1]+co[i];
            if(nx>=0 && ny>=0 && nx<grid.length && ny<grid.length && v[nx][ny]==-2 && grid[nx][ny]==0){
                v[nx][ny]=v[arr[0]][arr[1]]+1;
                q1.add(new int[]{nx,ny});
            }
        }
      }

      return v[n-1][n-1]+1;
    }
}