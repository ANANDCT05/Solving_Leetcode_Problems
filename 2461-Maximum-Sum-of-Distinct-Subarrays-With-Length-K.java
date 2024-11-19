class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        

        int f=0;
        int m=0;
        for(int i=0;i<nums.length;i++){
        m=Math.max(nums[i],m);
        }
       int ht[]=new int[m+1];

        long sum=0;
        long ans=0;

        for(int i=0;i<k;i++){

           ht[nums[i]]++;

            if(ht[nums[i]]>1){
                f++;
            }
            sum=sum+nums[i];
        }

        int i=0;
        int j=k-1;

        while(j<nums.length){

           if(f==0){
            ans=Math.max(ans,sum);
            sum=sum-nums[i];
        
        ht[nums[i]]--;
            i++;
            j++;
            if(j<nums.length){
                   sum=sum+nums[j];
               ht[nums[j]]++;
                if(ht[nums[j]]>1){
                    f++;
                }
            }
           }

           else{
         ht[nums[i]]--;
           sum=sum-nums[i];
         if(ht[nums[i]]>=1){
            f--;
         }
         i++;
      
         j++;
         if(j<nums.length){
            sum=sum+nums[j];
               ht[nums[j]]++;
                if(ht[nums[j]]>1){
                    f++;
                }
            }
       
           }


        }

        return ans;
    }
}