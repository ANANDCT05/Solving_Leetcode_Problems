class Solution {
    public int swimInWater(int[][] grid) {
        
        int d[][]=new int[grid.length][grid.length];
     

    int ro[]={1,-1,0,0};
    int co[]={0,0,1,-1};
   Comparator<int[]> c1=new Comparator<>(){
        public int compare(int a[],int b[]){

        if(a[2]>b[2]){
            return 1;
        }
        return -1;
    }
   };
   PriorityQueue<int[]>p1=new PriorityQueue<>(c1);
   d[0][0]=grid[0][0];
   p1.add(new int[]{0,0,d[0][0]});
   while(!p1.isEmpty()){
    int arr[]=p1.poll();

    for(int j=0;j<4;j++){
        int nx=arr[0]+ro[j];
        int ny=arr[1]+co[j];
        if(nx>=0 && ny>=0 && nx<grid.length && ny<grid.length ){

            int max=Math.max(grid[nx][ny],arr[2]);

            if(d[nx][ny] ==0 || d[nx][ny]>max){
                d[nx][ny]=max;
                p1.add(new int[]{nx,ny,max});
            }
        }
    }

   }

   return d[grid.length-1][grid.length-1];

        
    }
}