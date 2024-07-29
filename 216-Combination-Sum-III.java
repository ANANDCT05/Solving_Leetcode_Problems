class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        

        List<List<Integer>> h=new ArrayList<>();
        List<Integer> l=new ArrayList<>();

      int s=(k*(k+1))/2;
      if(s>n){
        return h;
      }

      check(h,l,k,n,1,0,0);
      return h;
    }
    public static void check(List<List<Integer>> h,List<Integer>l ,int k,int n,int i ,int m,int sum){
    

     

      if(m>k){
        return ;
      }

      if(m==k){
         

         if(sum==n){
            List<Integer> l1=new ArrayList<>(l);
            h.add(l1);
           
         }

         return ;
      }
     if(sum>n){
        return ;
     }
     if(i>9){
        return;
     }

     sum=sum+i;
     m=m+1;
     l.add(i);
     check(h,l,k,n,i+1,m,sum);

     sum=sum-i;
     m=m-1;
     l.remove(l.size()-1);
     check(h,l,k,n,i+1,m,sum);

    }
}