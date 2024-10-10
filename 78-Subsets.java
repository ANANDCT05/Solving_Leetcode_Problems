class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        
      List<List<Integer>> l2=new ArrayList<>();

        int max=( (int)Math.pow(2.0,nums.length))-1;

        for(int i=0;i<=max;i++){

           List<Integer> l1=new ArrayList<>();

           check(l1,l2,i,nums);
        }

return l2;
    }


    public static void check(List<Integer> l1,List<List<Integer>>l2,int i,int nums[]){


        String s3=Integer.toBinaryString(i);

        
int k=0;
       for(int l=s3.length()-1;l>=0;l--){
          if(s3.charAt(l)=='1'){
            l1.add(nums[k]);
          }
          k++;
        
        } 

        l2.add(l1);
    }
}