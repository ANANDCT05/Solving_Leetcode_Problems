class Solution {
    public int[] queryResults(int limit, int[][] queries) {
        
      HashMap<Integer,Integer>h1=new HashMap<>();
      HashMap<Integer,Integer>h2=new HashMap<>();
int res[]=new int[queries.length];
      for(int i=0;i<queries.length;i++){

        if(h1.get(queries[i][0])!=null){
             int r=h1.get(queries[i][0]);
            h2.put(r,h2.get(r)-1);
            if(h2.get(r)==0){
                h2.remove(r);
            }

        }
       
          
             h1.put(queries[i][0],queries[i][1]);
            h2.put(queries[i][1],h2.getOrDefault(queries[i][1],0)+1);
       

        res[i]=h2.size();

      }

      return res;
    }
}