class Solution {
    public int []singleNumber(int[] nums) {
      int ans=0;

      for(int i=0;i<nums.length;i++){
        ans=ans^nums[i];
      }
int b1=0;
int b2=0;
int x=(ans&(ans-1))^ans;
      for(int i=0;i<nums.length;i++){

        if((x&nums[i])!=0){
            b1=b1^nums[i];
        }
        else{
            b2=b2^nums[i];
        }
      }
    


    return new int[]{b1,b2};
    }
}