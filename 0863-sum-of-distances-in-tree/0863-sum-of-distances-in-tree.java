class Solution {
    public int[] sumOfDistancesInTree(int n, int[][] edges) {
        

        ArrayList<ArrayList<Integer>>l1=new ArrayList<>();
        int sub[]=new int[n];
        for(int i=0;i<n;i++){
            l1.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
           l1.get(edges[i][0]).add(edges[i][1]);
           l1.get(edges[i][1]).add(edges[i][0]);
           
        }

        dfs(sub,l1,0,-1);
        int val=odis(sub,l1,0,-1);

        int ans[]=new int[n];
        ans[0]=val;

        for(int i=0;i<l1.get(0).size();i++){
            anss1(l1.get(0).get(i),ans,l1,0, val,n,sub);
        }
        return ans;
    }
    public static int dfs(int sub[],ArrayList<ArrayList<Integer>>a1,int cur,int par){
        if(a1.get(cur).size()==0){
            return 1;
        }

        int co=0;

        for(int i=0;i<a1.get(cur).size();i++){

            if(a1.get(cur).get(i)!=par){
            co+=dfs(sub,a1,a1.get(cur).get(i),cur);
            }
        }

   sub[cur]=co;
   return co+1;
        
    }

    public static int odis(int sub[],ArrayList<ArrayList<Integer>>a1,int cur,int par){

        if(a1.get(cur).size()==0){
            return 0;
        }

        int c=0;


        for(int i=0;i<a1.get(cur).size();i++){
            if(a1.get(cur).get(i)!=par){
            c+=odis(sub,a1,a1.get(cur).get(i),cur);
            }
        }

        return c+sub[cur];
    }
   public static void anss1(int nn,int ans[],ArrayList<ArrayList<Integer>>a1,int par,int val,int n,int sub[]){


 ans[nn]=val-(sub[nn])+(n-sub[nn]-1)-1;

 for(int i=0;i<a1.get(nn).size();i++){

    if(a1.get(nn).get(i)!=par){
    anss1(a1.get(nn).get(i),ans,a1,nn,ans[nn],n,sub);
    }
 }
     

   }

}