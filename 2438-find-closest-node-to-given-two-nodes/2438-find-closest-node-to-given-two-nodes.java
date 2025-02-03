class Solution {
    public int closestMeetingNode(int[] edges, int node1, int node2) {
        
        int d[]=new int[edges.length];
        Arrays.fill(d,Integer.MIN_VALUE);
        int v=0;
    d[node1]=0;
        int s=node1;
        while(true){
        
         int g=edges[s];
         if(g==-1){
          break;
         }
         v++;
         if(d[g]!=Integer.MIN_VALUE){
            break;
         }
         d[g]=v;
         s=g;
        }
       

        int ans=Integer.MAX_VALUE;
        int n=-1;
        int m=0;
         s=node2;
        
        while(true){
      int g=s;
      if(g==-1 || d[g]==Integer.MAX_VALUE ){
       break;
      }
    
      if(d[g]!=Integer.MIN_VALUE ){
        int f=Math.max(d[g],m);
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
      m++;
        }

        if(n==-1){
            return -1;

        }

        return n;

    }
}