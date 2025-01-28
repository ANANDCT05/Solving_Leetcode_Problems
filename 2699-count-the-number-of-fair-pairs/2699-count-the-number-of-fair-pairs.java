class Solution {

    public long countFairPairs(int[] nums, int lower, int upper) {

          

          Arrays.sort(nums);
          return check(nums,upper)-check(nums,lower-1);

    }


    public static long check(int nums[],int v){
        int left=0;
        int right=nums.length-1;
        long res=0;

        while(left<=right){
            if((nums[left]+nums[right])<=v){
                res+=(right-left);
                left++;
            }

            else{
                right--;
            }
        }

        return res;
    }
}