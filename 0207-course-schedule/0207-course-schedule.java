class Solution {
    public boolean canFinish(int nu, int[][] pr) {
        
      int in[]=new int[nu];

      ArrayList<ArrayList<Integer>> a1=new ArrayList<>();

        for(int i=0;i<nu;i++){
            a1.add(new ArrayList<>());
        }

        for(int i=0;i<pr.length;i++){
            a1.get(pr[i][0]).add(pr[i][1]);
        }

      for(int i=0;i<pr.length;i++){

        in[pr[i][1]]++;
      }

   

      for(int i=0;i<nu;i++){
        if(in[i]==0){
    
           check(i,nu,a1,in);
        }
      }
for(int i=0;i<nu;i++){

    if(in[i]>0){
        return false;
    }
}

return true;


        
    }

    public static void check(int n,int nu, 
      ArrayList<ArrayList<Integer>> a1,int in[]){
            
            Queue<Integer> q1=new LinkedList<>();
            q1.add(n);
        
            
            while(!q1.isEmpty()){

                n=q1.poll();
                for(int l:a1.get(n)){
                        in[l]--;
                        if(in[l]==0){
                            q1.add(l);
                        }
                    }
                
            }


      }
}