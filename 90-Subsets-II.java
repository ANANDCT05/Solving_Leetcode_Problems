class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
       Arrays.sort(nums);
      List<List<Integer>> j=new ArrayList<>();
      List<Integer>l1=new ArrayList<Integer>();
      j.add(new ArrayList<>());

      gen(nums,0,l1,j);
      return j;
    }
    public static void gen(int nums[],int i,List<Integer> l1 ,List<List<Integer>> j){


   if(i==nums.length){
    List<Integer> l3=new ArrayList<>(l1);
    j.add(l3);
    return;

   }
    
   


  l1.add(nums[i]);
  gen(nums,i+1,l1,j);

  while(i<nums.length-1 && nums[i]==nums[i+1]){
    i++;
  }
  l1.remove(l1.size()-1);
  gen(nums,i+1,l1,j);

        
    }
}