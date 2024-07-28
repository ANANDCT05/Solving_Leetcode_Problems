class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        
       Arrays.sort(candidates);
       
 
        List<List<Integer>> l1=new ArrayList<>();
        List<Integer> l2=new ArrayList<>();
        
        check_Combination(l1,l2,target,candidates,0,0);
        return l1;
    }

    public static void  check_Combination(List<List<Integer>> l1,List<Integer> l2,int t,int[]c,int sum,int i){
       
         if(sum==t){
            List<Integer>l3=new ArrayList<>(l2);
            l1.add(l3);
            return;
        }
        if(sum>t){
            return ;
        }
       
         if(i>=c.length){
            return ;
         }
         
        
         
        

        sum+=c[i];
        l2.add(c[i]);
       check_Combination(l1,l2,t,c,sum,i+1);
       while(i<c.length-1 && c[i]==c[i+1]){
        i++;
       }
        l2.remove(l2.size()-1);
        sum-=c[i];
        
         
        check_Combination(l1,l2,t,c,sum,i+1);
        

    }
}