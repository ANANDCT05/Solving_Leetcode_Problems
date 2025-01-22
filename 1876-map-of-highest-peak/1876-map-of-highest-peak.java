class Solution {
    public int[][] highestPeak(int[][] isWater) {
        
        int max=0;

        Queue<int[]>q1=new LinkedList<>();
        int v[][]=new int[isWater.length][isWater[0].length];
        for(int i=0;i<isWater.length;i++){

            for(int j=0;j<isWater[0].length;j++){

                if(isWater[i][j]==1){
                    v[i][j]=1;
                    isWater[i][j]=0;
                    q1.add(new int[]{i,j});
                }
            }
        }
max=1;
int dirx[]={0,0,1,-1};
int diry[]={1,-1,0,0};
        while(!q1.isEmpty()){
            int t=q1.size();
            for(int i=0;i<t;i++){
                int ar[]=q1.poll();

                for(int j=0;j<4;j++){
                    int x=ar[0]+dirx[j];
                    int y=ar[1]+diry[j];
                    if( x<v.length && x>=0 && y<v[0].length && y>=0 && v[x][y]!=1 ){
                        v[x][y]=1;
                           isWater[x][y]=max;
                        q1.add(new int[]{x,y});
                    }
                }
            }
            max++;

        }
      
      
return isWater;


    }
}