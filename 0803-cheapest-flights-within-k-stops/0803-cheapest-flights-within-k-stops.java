class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        ArrayList<ArrayList<Pair<Integer,Integer>>>a1=new ArrayList<>();
      

        for(int i=0;i<n;i++){
            a1.add(new ArrayList<>());
        }
        for(int i=0;i<flights.length;i++){
            int a=flights[i][0];
            int de=flights[i][1];
            int r=flights[i][2];
            a1.get(a).add(new Pair<>(de,r));      
              }
        
       
        Queue<int[]>p1=new LinkedList<>();
        int arr[]=new int[]{src,0,0};
        int stop[]=new int[n];
        int cost[]=new int[n];
        p1.add(arr);
        Arrays.fill(stop,Integer.MAX_VALUE);
        Arrays.fill(cost,Integer.MAX_VALUE);
int ans=Integer.MAX_VALUE;
        while(!p1.isEmpty()){
        
          int dd[]=p1.poll();
          int s=dd[0];
          int co=dd[1];
          int stops=dd[2];
          if(s==dst){
            ans=Math.min(ans,co);
          }
          else{
            if((stops)>k){
                continue;
            }
            stops+=1;
            ArrayList<Pair<Integer,Integer>> a2=a1.get(s);
            for(int i=0;i<a2.size();i++){

                Pair<Integer,Integer> p11=a2.get(i);
                int nn=p11.getKey();
                int c=p11.getValue();
             
                if(cost[nn]>(co+c) || stop[nn]>stops){
                    cost[nn]=co+c;
                    stop[nn]=stops;
                     arr=new int[]{nn,co+c,stops};
p1.add(arr);

                }
                }
          }
          
        }

        if(ans==Integer.MAX_VALUE){
return -1;
        }

        return ans;
          

        

      
    }
}   