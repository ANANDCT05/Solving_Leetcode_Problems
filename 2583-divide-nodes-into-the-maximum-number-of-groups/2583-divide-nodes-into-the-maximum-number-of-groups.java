class Solution {
    public int magnificentSets(int n, int[][] edges) {
        
        int par[]=new int[n+1];
        int siz[]=new int[n+1];
        ArrayList<ArrayList<Integer>>a1=new ArrayList<>();
        ArrayList<ArrayList<Integer>>a2=new ArrayList<>();
        for(int i=0;i<=n;i++){
            a1.add(new ArrayList<>());
            par[i]=i;
            a2.add(new ArrayList<>());
            siz[i]=1;
        }
        for(int i=0;i<edges.length;i++){
            a1.get(edges[i][0]).add(edges[i][1]);
            a1.get(edges[i][1]).add(edges[i][0]);
           int u=findpar(par,edges[i][0]);
           int v=findpar(par,edges[i][1]);
           if(siz[u]>=siz[v]){
              par[v]=u;
             
               siz[u]+=siz[v];
               siz[v]=1;
           }
           else{
            par[u]=v;
            siz[v]+=siz[u];
            siz[u]=1;
           }
        }
        for(int i=1;i<=n;i++){
            int y=findpar(par,i);
            a2.get(y).add(i);
        }
int res=0;
    for(int i=1;i<=n;i++){
     if(a2.get(i).size()>0){
        
int m=-1;
        for(int j=0;j<a2.get(i).size();j++){
           int re= bfs(a2.get(i).get(j),a1,n);
           if(re==-1){
            return -1;
           }
           else{
            m=Math.max(m,re);
           }
        }
        res+=m;
     }
    }
    return res;
    }

   public static int findpar(int par[],int x){
   if(par[x]==x){
   return x;
   }
   
   return par[x]=findpar(par,par[x]);
   
   }

   public static int bfs(int n,ArrayList<ArrayList<Integer>> a1,int no){
    
     int v[]=new int[no+1];
     Queue<Integer> q1=new LinkedList<>();
     q1.add(n);
     int level=1;

     v[n]=level;
    while(!q1.isEmpty()){
     int nl=q1.size();

     for(int j=0;j<nl;j++){
        int nn=q1.poll();

        ArrayList<Integer> a2=a1.get(nn);
        for(int k=0;k<a2.size();k++){
            if(v[a2.get(k)]==0){
                v[a2.get(k)]=level+1;
                   q1.add(a2.get(k));
            }
            else if(v[a2.get(k)]==level){
                return -1;
            }
           
        }
     }

     level++;
      

    }

    return level-1;
   }
}