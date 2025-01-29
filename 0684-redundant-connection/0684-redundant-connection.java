class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        
      int par[]=new int[edges.length+1];
      int siz[]=new int[edges.length+1];
      for(int i=0;i<par.length;i++){
        par[i]=i;
        siz[i]=1;
      }  

      for(int i=0;i<edges.length;i++){
        int u=findpar(edges[i][0],par);
        int v=findpar(edges[i][1],par);
        if(u==v){

            return new int[]{edges[i][0],edges[i][1]};
        }
        else if(siz[u]>=siz[v]){
            par[v]=u;
            siz[v]=1;

        }
        else{
          par[u]=v;
          siz[u]=1;
        }
      }

      return null;
    }

    public static int findpar(int i,int par[]){
        if(par[i]==i){
            return i;
        }

        return par[i]=findpar(par[i],par);
    }
}