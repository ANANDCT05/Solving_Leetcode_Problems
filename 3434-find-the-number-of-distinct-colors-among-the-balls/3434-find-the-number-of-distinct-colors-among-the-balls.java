class Solution {
    public int[] queryResults(int limit, int[][] queries) {
        
      HashMap<Integer,Integer>h1=new HashMap<>();
      HashMap<Integer,Integer>h2=new HashMap<>();
int res[]=new int[queries.length];
      for(int i=0;i<queries.length;i++){
   Integer val=h1.get(queries[i][0]);
        if(val!=null){
         
            h2.put(val,h2.get(val)-1);
            if(h2.get(val)==0){
                h2.remove(val);
            }

        }
       
          
             h1.put(queries[i][0],queries[i][1]);
            h2.put(queries[i][1],h2.getOrDefault(queries[i][1],0)+1);
       

        res[i]=h2.size();

      }

      return res;
    }
}