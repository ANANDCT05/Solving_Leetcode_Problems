class Solution {
    public int makeConnected(int n, int[][] connections) {
        

  if((connections.length-(n-1))<0){
    return -1;
  }

  int con=0;
  ArrayList<ArrayList<Integer>>a1=new ArrayList<>();
  for(int i=0;i<n;i++){
    a1.add(new ArrayList<>());
  }
  for(int i=0;i<connections.length;i++){

     int s=connections[i][0];
     int e=connections[i][1];
     a1.get(s).add(e);
     a1.get(e).add(s);
  }
  int v[]=new int[n];
    for(int i=0;i<n;i++){
        if(v[i]==0 ){
            dfs(i,a1,v);
            con++;
        }
    }

    return con-1;
   
   
    }

    public static void dfs(int n,ArrayList<ArrayList<Integer>> a1,int v[]){

        if(v[n]==1){
            return ;
        }
        v[n]=1;
        ArrayList<Integer>  c1=a1.get(n);

        for(int j=0;j<c1.size();j++){
            dfs(c1.get(j),a1,v);
        }
    }
}