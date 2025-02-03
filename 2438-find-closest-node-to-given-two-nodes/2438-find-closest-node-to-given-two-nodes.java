class Solution {
    public int closestMeetingNode(int[] edges, int node1, int node2) {
        
        int d[]=new int[edges.length];
      
        int v=1;
    d[node1]=1;
        int s=node1;
        while(true){
        
         int g=edges[s];
         if(g==-1){
          break;
         }
         v++;
         if(d[g]!=0){
            break;
         }
         d[g]=v;
         s=g;
        }
       

        int ans=Integer.MAX_VALUE;
        int n=-1;
        v=1;
         s=node2;
        
        while(true){
      int g=s;
      if(g==-1 || d[g]==Integer.MAX_VALUE ){
       break;
      }
    
      if(d[g]!=0 ){
        int f=Math.max(d[g],v);
        if(f<ans){
            ans=f;
            n=g;
        }
        else if(f==ans){
            n=Math.min(n,g);
        }

      }
      d[g]=Integer.MAX_VALUE;
  s=edges[g];
      v++;
        }

        if(n==-1){
            return -1;

        }

        return n;

    }
}