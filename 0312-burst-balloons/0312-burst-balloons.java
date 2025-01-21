class Solution {
    public int maxCoins(int[] nums) {
        if(nums.length==1){
            return  nums[0];
        }
        Integer dp[][]=new Integer[nums.length][nums.length];
        return check(0,nums.length-1,dp,nums);
    }

    public static int check(int i,int j,Integer dp[][],int nums[]){
       if(i>j){
        return 0;
       }
        if(j-i==0){
             if(i==0){
                return nums[i]*nums[i+1];
             }
             else if(i==nums.length-1){
                return nums[i-1]*nums[i];
             }
             else{
                return nums[i-1]*nums[i]*nums[i+1];
             }
        }
        if(dp[i][j]!=null){
            return dp[i][j];
        }
        int max=0;

int left=1;
int right=1;
if(i==0){
    left=1;
}
else{
    left=nums[i-1];
}
if(j==nums.length-1){
    right=1;
}
else{
    right=nums[j+1];
}
        for(int k=i;k<=j;k++){
int oper=check(i,k-1,dp,nums)+check(k+1,j,dp,nums)+(left*nums[k]*right);
max=Math.max(oper,max);
           
        }

        return dp[i][j]=max;
    }
}