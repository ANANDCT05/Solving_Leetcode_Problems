class Solution {
    public int longestSubarray(int[] nums) {
       
int len=1;
int m=1;
int i=0;
int n=nums.length;
       
       int max=nums[0];

        for( i=1;i<n;i++){

          if(nums[i]>max){
         len=1;
         m=1;
         max=nums[i];
          }
         else if(nums[i]==max){
            len++;
            if(len>m){
            m=len;
          }
          }

          else{
           
            len=0;

          }

        

        }

         
            
        

        return m;

        
    }
}