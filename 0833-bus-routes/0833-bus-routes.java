class Solution {
    public int numBusesToDestination(int[][] routes, int source, int target) {
if(source==target){
    return 0;
}
       int n=routes.length;
       ArrayList<ArrayList<Integer>>a1=new ArrayList<>();
       for(int i=0;i<n;i++){
       a1.add(new ArrayList<>());
       
       }
       int k[][]=new int[n][n];
       HashMap<Integer,List<Integer>>h1=new HashMap<>();

       for(int i=0;i<routes.length;i++){

        for(int j=0;j<routes[i].length;j++){

            if(h1.get(routes[i][j])==null){
                List<Integer>l1=new ArrayList<>();
                l1.add(i);
                h1.put(routes[i][j],l1);
            }
            else{
                List<Integer>l1=h1.get(routes[i][j]);
                for(int m=0;m<l1.size();m++){
                if(k[i][l1.get(m)]==0){
                  a1.get(i).add(l1.get(m));
                  a1.get(l1.get(m)).add(i);
                 k[i][l1.get(m)]=1;
                 k[l1.get(m)][i]=1;
                }
                }
            l1.add(i);
            h1.put(routes[i][j],l1);
            }
        }
       }
       
       
    int v[]=new int[n];
  int e[]=new int[n];
  Arrays.fill(v,Integer.MAX_VALUE);

Queue<Integer>q1=new LinkedList<>();
   
    List<Integer>l1=h1.get(target);
    if(l1==null){
        return -1;
    }
    for(int i=0;i<l1.size();i++){
        e[l1.get(i)]=-1;
    }
    l1=h1.get(source);
    if(l1==null){
        return -1;
    }
    for(int i=0;i<l1.size();i++){
       q1.add(l1.get(i));
       v[l1.get(i)]=0;
    }
    int s=1;
    
    while(!q1.isEmpty()){

      int m=q1.size();

      for(int j=0;j<m;j++){
          
          int nn=q1.poll();
if(e[nn]==-1){
    return s;
}
          for(int kk:a1.get(nn)){

            if(v[kk]>s){
                v[kk]=s;
                q1.add(kk);
            }
          }
      }
      s++;
      
    }
    return -1;

       
          
    }
}