class Solution {
    public int[] countVisitedNodes(List<Integer> edges) {
        

        int v[]=new int[edges.size()];

        int ans[]=new int[edges.size()];
        for(int i=0;i<edges.size();i++){
            if(v[i]==0){

                check(v,edges,ans,1,i);
            }
        }

        return ans;
    }


    public static int check(int v[],List<Integer>l1,int ans[],int c,int i){

        if(ans[i]!=0){
            return ans[i];
        }

        if(v[i]!=0){

            int cycle=c-v[i];
            v[i]=-1;
            return -cycle;
        }
  v[i]=c;
        int anss=check(v,l1,ans,c+1,l1.get(i));
        if(anss<0){
            ans[i]=-anss;

              if(v[i]==-1){
            return -anss;
        }
        else{
            return anss;
        }
        }
       ans[i]=anss+1;

        return ans[i];

    
    }
}