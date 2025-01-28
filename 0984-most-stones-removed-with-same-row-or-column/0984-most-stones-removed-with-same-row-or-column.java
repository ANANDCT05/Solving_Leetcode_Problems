class Solution {
    public int removeStones(int[][] stones) {
        
        int maxx=-1;
        int maxy=-1;
        for(int i=0;i<stones.length;i++){
            maxx=Math.max(maxx,stones[i][0]);
            maxy=Math.max(maxy,stones[i][1]);
        }
        
        int par[]=new int[maxx+maxy+2];
        int siz[]=new int[maxx+maxy+2];
        for(int i=0;i<par.length;i++){
           par[i]=i;
           siz[i]=1;
        }
      
       

        for(int i=0;i<stones.length;i++){
            int v=findpar(stones[i][0],par);
            int f=findpar(maxx+1+stones[i][1],par);
            if(v!=f){

                if(siz[v]>=siz[f]){
                    siz[v]+=siz[f];
                    par[f]=v;
                    siz[f]=1;
                }
                else{
                    siz[f]+=siz[v];
                    par[v]=f;
                    siz[v]=1;
                }
                

            }
        }
      int comp=0;
      for(int i=0;i<par.length;i++){
        if(siz[i]>1){
            comp++;
        }
      }

      return (stones.length)-(comp);


    }

    public static int findpar(int x,int par[]){
        if(x==par[x]){
            return x;
        }

        return par[x]=findpar(par[x],par);
    }
  
}

