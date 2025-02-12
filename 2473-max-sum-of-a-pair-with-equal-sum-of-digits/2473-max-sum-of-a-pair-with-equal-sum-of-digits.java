class Solution {
    public int maximumSum(int[] nums) {
        
      int ans[][]=new int[91][2];
      
      for(int i=0;i<nums.length;i++){

        int sum=0;
        int val=nums[i];
        while(val>0){
            sum=sum+val%10;
            val=val/10;
        }

        int fir=ans[sum][0];
        int sec=ans[sum][1];
         val=nums[i];
     if(fir>=sec &&  fir>=val){
        ans[sum][0]=fir;
        ans[sum][1]=Math.max(sec,val);
     }
 else if(sec>=fir &&  sec>=val){
        ans[sum][0]=sec;
        ans[sum][1]=Math.max(fir,val);
     }
     else{
        ans[sum][0]=val;
        ans[sum][1]=Math.max(fir,sec);
     }

      }
int max=0;
      for(int i=0;i<=90;i++){

        if(ans[i][0] !=0 && ans[i][1]!=0){
            max=Math.max(ans[i][0]+ans[i][1] ,max);
        }
      }
      if(max==0){
        return -1;
      }

      return max;
    }
}