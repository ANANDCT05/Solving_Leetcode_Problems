class Solution {
    public int minMoves2(int[] nums) {

        Arrays.sort(nums);
         int m=(nums[(nums.length)/2]);

        int sum=0;

        for(int i=0;i<nums.length;i++){
            sum=sum+Math.abs(nums[i]-m);

        }
        return sum;
    }

}