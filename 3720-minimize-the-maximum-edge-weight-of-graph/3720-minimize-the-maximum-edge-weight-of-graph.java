class Solution {
    public int minMaxWeight(int n, int[][] edges, int threshold) {
        

        ArrayList<ArrayList<Pair<Integer,Integer>>>a1=new ArrayList<>();

        for(int i=0;i<n;i++){
            a1.add(new ArrayList<>());
        }
        int max=0;

        for(int i=0;i<edges.length;i++){
            max=Math.max(edges[i][2],max);
            int src=edges[i][1];
            Pair<Integer,Integer>p1=new Pair<>(edges[i][0],edges[i][2]);
            a1.get(src).add(p1);
        }
int low=1;
int high=max;

while(low<=high){

    int mid=(low+high)/2;
    
    if(ispos(mid,a1,new int [n])==true){
        high=mid-1;
    }
    else{
        low=mid+1;
    }
}
if(low>max){
    return -1;
}

return low;

    }

public static boolean ispos(int max,ArrayList<ArrayList<Pair<Integer,Integer> >> a1,int v[]){

      v[0]=1;
      Queue<Integer>q1=new LinkedList<>();
      q1.add(0);
      int t=1;
      while(!q1.isEmpty()){
int n=q1.poll();
    List<Pair<Integer,Integer>>l1=a1.get(n);
    for(int i=0;i<l1.size();i++){
        int r=l1.get(i).getKey();
        int d=l1.get(i).getValue();

        if(v[r]==0 && d<=max){
            q1.add(r);
            t++;
            v[r]=1;
        }
    }
      }
      if(t==v.length){
        return true;
      }

      return false;
}
}