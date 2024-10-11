class Solution {
    public int smallestChair(int[][] times, int targetFriend) {
        
     int a=times[targetFriend][0];

     
        Arrays.sort(times,new Comparator<int[]>(){
         public int compare(int a[],int b[]){
                if(a[0]>b[0]){
                    return 1;
                }
                return -1; }   });
  
  
    int n=0;
      int j=1;
      if(a==times[0][0]){
        return 0;
      }
      HashMap<Integer,Integer> t1=new HashMap<>();
t1.put(0,times[0][1]);
      while(j<times.length && times[j][0]!=a){
       int flag=0;
int ar=times[j][0];
       for(Map.Entry<Integer,Integer> a1:t1.entrySet()){

        int k=a1.getKey();
        int v=a1.getValue();

        if((v==-1|| ar>v ) && flag==0 ){
     
       t1.put(k,times[j][1]);
       flag=1;
      
        }

        else if(v==ar){
            if(flag==0){
                t1.put(k,times[j][1]);
                flag=1;
            }
            else{
                t1.put(k,-1);
            }
        }


       }

       if(flag==0){
        n++;
        t1.put(n,times[j][1]);
    
       }
       j++;
    
      
      }
      
 for(Map.Entry<Integer,Integer> a1:t1.entrySet()){

        int k=a1.getKey();
        int v=a1.getValue();

        if(v==-1|| a>=v){
     
       return k;
      
      
        }

      


       }

      n++;

    return n;




    
    }
}