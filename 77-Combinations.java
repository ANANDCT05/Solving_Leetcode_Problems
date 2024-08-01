class Solution {
    public List<List<Integer>> combine(int n, int k) {
        
List<Integer> l1=new ArrayList<>();
List<List<Integer>>l2=new ArrayList<>();
        check(1,n,k,l1,l2);
        return l2;

    }


    public static void check(int i,int n,int k,List<Integer>l1,List<List<Integer>>l2 ){


   
        if(l1.size()==k){
            l2.add(new ArrayList<>(l1));
            return;
        }
        if(i>n){
            return;
        }
  
        

        l1.add(i);
        check(i+1,n,k,l1,l2);
        l1.remove(l1.size()-1);
        check(i+1,n,k,l1,l2);

    }
}