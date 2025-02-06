class Solution {
    int b;
    int l;

    public Solution(int b,int l){
        this.b=b;
        this.l=l;
    }
public Solution(){

}
@Override
public int hashCode() {
    return Objects.hash(b, l);
}
    public boolean equals(Object o){
        if(this==o){
       return true;
        }
        Solution s=(Solution)(o);
        return b==s.b && l==s.l;
    }
    public int shortestPathLength(int[][] graph) {
        
       int n=graph.length;
       int m=(1<<n)-1;

       int min=Integer.MAX_VALUE;
Set<Solution>s1=new HashSet<>();
        for(int i=0;i<n;i++){
    s1=new HashSet<>();
        min=Math.min(min,bfs(s1,i,m,graph));
        }

       return min;
    }
public static int bfs(Set<Solution> s1,int n,int m,int graph[][]){

    int b=1<<n;
    Queue<int[]>q1=new LinkedList<>();
    s1.add(new Solution(b,n));
    int arr[]=new int[]{b,n};
    int c=0;
    q1.add(arr);
    while(!q1.isEmpty()){
      int l=q1.size();
      
      for(int i=0;i<l;i++){

        int d[]=q1.poll();

    int bb=d[0];
    if(bb==m){
        return c;
    }
        for(int k:graph[d[1]]){
   
   
    bb=d[0]|(1<<k);
      Solution s11=new Solution(bb,k);
      if(s1.add(s11)){
        int mm[]=new int[]{bb,k};
        q1.add(mm);
      }
      

        }
        
      }
      c++;


    }
    return 0;
}

}