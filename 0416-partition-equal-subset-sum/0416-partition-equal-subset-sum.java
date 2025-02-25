class Solution {
    public boolean canPartition(int[] nums) {
        

    Boolean dp[][]=new Boolean[nums.length][20000];
      int tot=0;
     for(int i=0;i<nums.length;i++){
        tot+=nums[i];
     }

     return check(0,nums,tot,0,dp);



    }
    public static boolean check(int i,int nums[],int tot,int my,Boolean dp[][]){
        if(i==nums.length){
      if(my == (tot-my)){
        return true;
      }
      return false;
        }
        if(dp[i][my]!=null){
            return false;
        }

        return dp[i][my]=check(i+1,nums,tot,my+nums[i],dp)  || check(i+1,nums,tot,my,dp);
    }
}