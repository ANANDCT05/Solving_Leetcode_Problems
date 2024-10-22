class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> l3=new ArrayList<>();
                 
             List<List<Integer>> l1=new ArrayList<>();

             int k=0;
 
 check(nums,k,l1,l3);
             return l1;

    }

    public static void check(int[]nums,int k,List<List<Integer>>l1,List<Integer>l3){
        if(k==nums.length){
            List<Integer> l2=new ArrayList<>(l3);
            l1.add(l2);
            return;
        }



        for(int i=0;i<nums.length;i++){
        
        if(nums[i]!=-11){
            int t=nums[i];
       nums[i]=-11;
            l3.add(t);
            check(nums,k+1,l1,l3);
            l3.remove(l3.size()-1);
            nums[i]=t;
        }
            
        }
    }
    }
