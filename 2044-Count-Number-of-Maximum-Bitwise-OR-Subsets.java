class Solution {
    int c=0;
    
    public int countMaxOrSubsets(int[] nums) {
       int max=0;
        
        for(int i=0;i<nums.length;i++){
max=max|nums[i];
        }
      
        

        check(nums,0,max,0);
        return c;
    }

    public  void check(int nums[],int i,int max,int ans){
        
      
        if(i==nums.length){
            if(ans==max){
 c++;
            }
            return ;
        }


       check(nums,i+1,max,ans|nums[i]);

       check(nums,i+1,max,ans);

    }
}