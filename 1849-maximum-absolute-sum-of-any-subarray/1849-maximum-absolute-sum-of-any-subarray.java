class Solution {
    public int maxAbsoluteSum(int[] nums) {
        
        int max=Integer.MIN_VALUE;
        int max1=Integer.MAX_VALUE;
       int sum=0;

       int sum1=0;
        for(int i=0;i<nums.length;i++){
           
           sum=sum+nums[i];
           if(sum<0){
            sum=0;
           }
           max=Math.max(sum,max);
           sum1=sum1+nums[i];
           if(sum1>0){
            sum1=0;
           }
           max1=Math.min(sum1,max1);

           
        }

        return Math.max(Math.abs(max1),max);
        
    }
}