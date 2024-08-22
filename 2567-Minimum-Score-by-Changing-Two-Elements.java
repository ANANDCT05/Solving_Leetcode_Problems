class Solution {
    public int minimizeSum(int[] nums) {

      
        Arrays.sort(nums);
        int t=0;
        int l=nums.length-3;
        int min=Integer.MAX_VALUE;
        int d=0;

        while(l<nums.length){
    d=nums[l]-nums[t];
    if(d<min){
        min=d;
    }
    t++;
    l++;
        }

        return min;

    }
}