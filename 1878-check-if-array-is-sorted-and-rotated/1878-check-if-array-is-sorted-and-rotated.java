class Solution {
    public boolean check(int[] nums) {
        
        int max=99999;
        int count=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
               count++;
            }

        }

        if(count==1){
            if(nums[0]<nums[nums.length-1]){
                return false;
            }
            else{
                return true;
            }
        }
      if(count==0){
        return true;
      }
      return false;
    }
}