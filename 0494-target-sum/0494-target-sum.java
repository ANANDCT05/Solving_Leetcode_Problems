class Solution {
    public int findTargetSumWays(int[] nums, int t) {
        


    int sum=0;
    for(int i=0;i<nums.length;i++){
        sum=sum+nums[i];
    }

    Integer dp[][]=new Integer[sum+1][nums.length];

    return check(0,0,dp,t,nums);
    }
public static int check(int i,int s,Integer dp[][],int t,int nums[]){

    if(i==nums.length){
       if(s==t){
        return 1;
       }

       return 0;
    }

   



    return check(i+1,s-nums[i],dp,t,nums)+check(i+1,s+nums[i],dp,t,nums);
}

}