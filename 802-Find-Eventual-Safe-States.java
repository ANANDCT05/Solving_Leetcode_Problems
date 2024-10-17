class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {

        int v[]=new int [graph.length];

    
        int ans[]=new int[graph.length];

        for(int i=0;i<graph.length;i++){

        int arr[]=graph[i];
int f=0;
  

        for(int j=0;j<arr.length;j++){
            
            if(ans[arr[j]]==0 ){
   
                if(check(arr[j],v,graph,ans)==false){
                    ans[arr[j]]=-1;
                    f=1;
                }

                
            }

            else if(ans[arr[j]]==-1){
                ans[i]=-1;
                f=1;
                break;
            }

        }

        if(f==0){
            ans[i]=1;
        }
        


        }

        List<Integer>l1=new ArrayList<>();
        for(int i=0;i<ans.length;i++){
            if(ans[i]==1){
                l1.add(i);
            }
        }
        return l1;
    }

        public  static boolean check(int n,int[] v,int [][]graph,int ans[]){
        
if(ans[n]==1){
    return true;
}
if(ans[n]==-1){
    return false;
}


        if(v[n]==1){
            return false;
        }


        v[n]=1;

        int arr[]=graph[n];
        
        for(int i=0;i<arr.length;i++){

            if(check(arr[i],v,graph,ans)==false){

                ans[arr[i]]=-1;
                return false;
            }
            
            
        }
      
       
        ans[n]=1;
        return true;
        }       

    
}