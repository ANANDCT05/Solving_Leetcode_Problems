class Solution {
    public List<Boolean> checkIfPrerequisite(int numCourses, int[][] p, int[][] queries) {


    int  no[]=new int[numCourses];
    ArrayList<Integer>adj[]=new ArrayList[numCourses];
    int incom[]=new int[numCourses];
    for(int i=0;i<p.length;i++){
        if(adj[p[i][1]]==null){
            ArrayList<Integer> a1=new ArrayList<>();
            a1.add(p[i][0]);
            adj[p[i][1]]=a1;

        }
        else{
            adj[p[i][1]].add(p[i][0]);
            
        }
          incom[p[i][0]]++;
    }
int arr[][]=new int[numCourses][numCourses];
int v[]=new int[numCourses];
    for(int i=0;i<numCourses;i++){
        if(incom[i]==0 && v[i]==0){

            topo(arr,i,v,incom,adj);
        }
    }
    List<Boolean>l1=new ArrayList<>();
    
    for(int i=0;i<queries.length;i++){
        int preq=queries[i][0];
        int co=queries[i][1];
        if(arr[preq][co]==1){
            l1.add( true);
        }
        else{
        l1.add(false);
        }
    }
    return l1;

  }

  public static void topo(int arr[][],int n,int v[],int incom[],ArrayList<Integer>adj[]){

    Queue<Integer> q1=new LinkedList<>();
    q1.add(n);

    while(!q1.isEmpty()){
 
      n=q1.poll();
     v[n]=1;
     ArrayList<Integer> a1=adj[n];
     if(a1==null){
        continue;
     }
     for(int i=0;i<a1.size();i++){
        int g=a1.get(i);
       for(int l=0;l<adj.length;l++){
     
     if(arr[n][l]==1){
        arr[g][l]=1;
     }
       }
       arr[g][n]=1;
       incom[g]--;
     if(incom[g]==0){
        q1.add(g);
     }
    }
  }
}
}