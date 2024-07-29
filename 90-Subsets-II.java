class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        
        Arrays.sort(nums);
        List<List<Integer>>l1=new ArrayList<>();
        List<Integer> l2=new ArrayList<>();
    l1.add(new ArrayList<Integer>());
        check(l1,l2,0,nums);
        return l1;
    }


    public static void check(List<List<Integer>> l1,List<Integer> l2,int i,int[]n){
        
        if(i==n.length)
        {
            return;
        }

        

        
      
        l2.add(n[i]);
        List<Integer> l3=new ArrayList<>(l2);
         l1.add(l3);
        check(l1,l2,i+1,n);
        while(i<n.length-1 && n[i] ==n[i+1]){
            i++;
        }

        l2.remove(l2.size()-1);
        check(l1,l2,i+1,n);


    }
}