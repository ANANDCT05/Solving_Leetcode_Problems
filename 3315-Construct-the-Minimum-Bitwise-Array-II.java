class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        
        int ans[]=new int[nums.size()];
  
        for(int i=0;i<nums.size();i++){

            int val=nums.get(i);

            if(nums.get(i)%2==0){

                ans[i]=-1;
            } 
            else{
       

         int a=  (val ^(val+1) );
         int b=Integer.bitCount(a)-2;
        
         ans[i]  =val ^(1<<b);


            

            }

}

           
        

        return ans;
    }
}