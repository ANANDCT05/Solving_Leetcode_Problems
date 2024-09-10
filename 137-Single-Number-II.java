class Solution {
    public int singleNumber(int[] nums) {
        int ones=0;
        int two=0;
        int three=0;

        for(int i=0;i<nums.length;i++){

         ones=  (ones^nums[i]) & (~two);
          two=( two^nums[i])& (~ones);
three=(three^nums[i])&(~two);
            
        }

return ones;
    }
}