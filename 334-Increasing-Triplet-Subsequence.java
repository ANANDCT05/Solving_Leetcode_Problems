class Solution {
    public boolean increasingTriplet(int[] nums) {
        

        int f=Integer.MAX_VALUE;
        int s=Integer.MAX_VALUE;
int i=0;
        while(i<nums.length){


            if(nums[i]<f){
                f=nums[i];
            }

            else if(nums[i]<s  && nums[i]>f){
                s=nums[i];
            }

          else if(nums[i]>s ){
            return true;
          }
            i++;

        }

        return false;

        
    }


    
}