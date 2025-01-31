class Solution {
    public int largestIsland(int[][] grid) {
        

        int max=0;
        int v[][]=new int[grid.length][grid[0].length];
        int gro[]=new int[grid.length*grid.length+1];
        int gr=0;
        Queue<Pair<Integer,Integer>>q1=new LinkedList<>();
        for(int i=0;i<grid.length;i++){

            for(int j=0;j<grid.length;j++){
             if(v[i][j]==0 && grid[i][j]==1){
                gr++;
                  bfs(gro,grid,i,j,v,gr);
             }
             else if(grid[i][j]==0){
                q1.add(new Pair<>(i,j));
             }
            }
        }

        int ro[]={-1,1,0,0};
        int co[]={0,0,-1,1};
        int gg[]=new int[gr+1];
      if(gr==0){
        return 1;
      }
        if(q1.isEmpty()){
          return gro[1];
        }
        while(!q1.isEmpty()){

            Pair<Integer,Integer>p1=q1.poll();
          int ans=1;
          for(int i=0;i<4;i++){
    int nx=p1.getKey()+ro[i];
    int ny=p1.getValue()+co[i];

    if(nx>=0 && ny>=0 && nx<grid.length && ny<grid.length ){
  if(gg[v[nx][ny]]==0){
    ans=ans+gro[v[nx][ny]];

    gg[v[nx][ny]]=1;
  }
     

    }
    max=Math.max(ans,max);
          }
    for(int i=0;i<gg.length;i++){
        gg[i]=0;
    }
          
          }

        
        return max;
        
        
        

    
    }
    public static void bfs(int gro[],int grid[][],int i,int j,int v[][],int gr){


int ro[]={-1,1,0,0};
int co[]={0,0,-1,1};
Queue<Pair<Integer,Integer>>q1=new LinkedList<>();
q1.add(new Pair<>(i,j));
int vv=0;
v[i][j]=gr;
while(!q1.isEmpty()){

    Pair<Integer,Integer> p1=q1.poll();
vv++;

for(int k=0;k<4;k++){

    int nx=p1.getKey()+ro[k];
    int ny=p1.getValue()+co[k];
    if(nx>=0 && ny>=0 && nx<grid.length && ny<grid[0].length && grid[nx][ny]==1 && v[nx][ny]==0){
        v[nx][ny]=gr;
        q1.add(new Pair<>(nx,ny));
    }
}
}

gro[gr]=vv;
return;


    }
}