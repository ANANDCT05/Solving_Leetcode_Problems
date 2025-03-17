class Solution {
    public boolean divideArray(int[] nums) {
        

        int ht[]=new int[501];
        for(int i=0;i<nums.length;i++){
            ht[nums[i]]++;
        }
        for(int i=0;i<nums.length;i++){

            if((ht[nums[i]]%2 )!= 0){ 
                return false;
            }
        }
        return true;
    }
}