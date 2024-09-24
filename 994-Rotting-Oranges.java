
class Solution {
    public int orangesRotting(int[][] grid) {
        
        Queue<Pair<Pair<Integer,Integer>,Integer>> q=new LinkedList<>();
        


int v[][]=new int[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==2){
                    q.add(new Pair(new Pair(i,j),0));
                    v[i][j]=2;
                }
            }
        }

    int r[]={-1,0,+1,0};
    int c[]={0,+1,0,-1};
    int t=0;

   while(!q.isEmpty()){

    Pair<Pair<Integer,Integer>,Integer> p1=q.poll();
    int i=p1.getKey().getKey();
    int j=p1.getKey().getValue();
    t=Math.max(t,p1.getValue());

    for(int k=0;k<4;k++){
        int r1=i+r[k];
        int c1=j+c[k];

        if(r1>=0 && r1<grid.length && c1>=0 && c1<grid[0].length && v[r1][c1]!=2 && grid[r1][c1]==1){

            q.add(new Pair(new Pair(r1,c1),t+1));
            v[r1][c1]=2;
        }
    }

   }

   for(int i=0;i<grid.length;i++){

    for(int j=0;j<grid[0].length;j++){

        if(v[i][j]!=2 && grid[i][j]==1){
            return -1;
        }
    }
   }
   return t;


    }
}