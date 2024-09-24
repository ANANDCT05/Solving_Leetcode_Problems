class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int s=image[sr][sc];
int v[][]=new int[image.length][image[0].length];
int r[]={-1,0,+1,0};
int c[]={0,+1,0,-1};        
check(sr,sc,image,r,c,color,s,v);

return image;
    }


    public static void check(int i,int j,int [][]image,int r[],int c[],int col,int s,int v[][]){

        image[i][j]=col;

        v[i][j]=1;

    for(int k=0;k<4;k++){
        int r1=i+r[k];
        int c1=j+c[k];

        if(r1>=0 && r1<image.length && c1>=0 && c1<image[0].length && v[r1][c1]==0 && image[r1][c1]==s ){
    
            check(r1,c1,image,r,c,col,s,v);

        }
    }
    }
}