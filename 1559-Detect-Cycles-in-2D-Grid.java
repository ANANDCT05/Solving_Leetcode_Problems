class Solution {
    public boolean containsCycle(char[][] grid) {
        

    int vist[][]=new int [grid.length][grid[0].length];


    for(int i=0;i<grid.length;i++){

        for(int j=0;j<grid[0].length;j++){
          
          
          if(vist[i][j]==0 && helper(1,grid,vist,grid[i][j],i,j)){
            return true;
          }
        }
    }
    return false;
    }



    public static boolean helper(int c,char [][] g,int [][] v,char a,int i,int j){

        if(i==-1 || i==g.length){
            return false;
        }
        if(j==-1 || j==g[0].length){
            return false;
        }
     if(g[i][j]!=a){
        return false;
     }
        if(v[i][j]==1){
            return true;
        }
        v[i][j]=1;

        if(c!=1){
            if(helper(-1,g,v,g[i][j],i-1,j)){
                return true;
            }
        }

        if(c!=-1){
           if(helper(1,g,v,g[i][j],i+1,j)){
            return true;
           }
        }

        if(c!=-2){
           if( helper(2,g,v,g[i][j],i,j-1)){
            return true;
           }
        }

        if(c!=2){
            if(helper(-2,g,v,g[i][j],i,j+1)){
                return true;
            }
        }

        

        return false;
        

    } 
}