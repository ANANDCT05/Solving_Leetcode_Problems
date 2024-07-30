class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);

        if(nums.length<3){
            return nums[nums.length-1];
        }

        int ans=nums[nums.length-1];

        int count=0;

      for(int i=nums.length-1;i>0;i--){
   if(nums[i]!=nums[i-1]){
    count++;
   }

   if(count==3){
    return nums[i];
   }
      }
   if(count==2){
    return nums[0];
   }
return ans;
      
    }
}