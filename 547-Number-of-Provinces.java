class Solution {
    public int findCircleNum(int[][] isConnected) {
        

int n=isConnected.length;
    int v[]=new int[n+1];
int count=0;


    for(int i=0;i<n;i++){

        if(v[i]==0){
     count++;
     dfs(i,isConnected,v,n);
        }
    }

return count;
    }

    public static void dfs(int i,int[][]is,int v[],int n){

        v[i]=1;

        for(int j=0;j<n;j++){
            if(j!=i &&  is[i][j]==1 && v[j]==0 ){
                dfs(j,is,v,n);
            }
        }
    }
}