class Solution {
    public int countPaths(int n, int[][] roads) {
        
     ArrayList<ArrayList<Pair<Integer,Long>>> a1=new ArrayList<>();
     
     for(int i=0;i<n;i++){
        a1.add(new ArrayList<>());
     }
     for(int i=0;i<roads.length;i++){
        Pair <Integer,Long>p1=new Pair<>(roads[i][1],(long)roads[i][2]);
        Pair<Integer,Long>p2=new Pair<>(roads[i][0],(long)roads[i][2]);
        a1.get(roads[i][0]).add(p1);
        a1.get(roads[i][1]).add(p2);
     }

     long d[]=new long[n];
     Arrays.fill(d,Long.MAX_VALUE);
     d[0]=0;
     
     Queue<Pair<Integer,Long>>q1=new PriorityQueue<>((a,b)->{
        return Long.compare(a.getValue(),b.getValue());
     });
     q1.add(new Pair<>(0,0l));
     int c[]=new int[n];
     Arrays.fill(c,-1000);
     c[0]=1;
     
     while(!q1.isEmpty()){
      
      Pair<Integer,Long>d1=q1.poll();
      for(  Pair<Integer,Long> p1:a1.get(d1.getKey())){
        int g=p1.getKey();
        long di=(d1.getValue()+p1.getValue());
        if(d[g] >di){
            d[g]=di;
            q1.add(new Pair<>(g,d[g]));
            c[g]=c[d1.getKey()];
            
        }
        else if(d[g]== di){
            c[g]=(c[g]+c[d1.getKey()])%(1000000007);
        }
        
      }
     }

     return c[n-1];
 
    



    }

}