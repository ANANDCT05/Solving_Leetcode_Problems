class Solution {
    public int fillCups(int[] nums) {
  Arrays.sort(nums);
  int f=nums[0];
  int a=nums[1];
  int b=nums[2];
  while(nums[0]!=0){
  int r=Math.max(a,b)-1;
  int r2=Math.min(a,b);
  nums[0]--;
  a=r;
  b=r2;

   
  }

  return f+Math.max(a,b);
   
    }
}