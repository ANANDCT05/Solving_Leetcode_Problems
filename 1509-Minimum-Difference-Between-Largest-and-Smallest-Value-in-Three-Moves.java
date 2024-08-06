class Solution {
    public int minDifference(int[] nums) {

        if(nums.length<=4){
            return 0;
        }
        Arrays.sort(nums);

       int l=0;
       int r=nums.length-4;
int d=0;
int min=Integer.MAX_VALUE;
       while(r<nums.length){
   d=nums[r]-nums[l];

   if(d<min){
    min=d;
   }

   l++;
   r++;
       }

       return min;
   
    }
}