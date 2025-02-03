class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int m=-1;
        int c=0;
        int v=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>m){
                c++;
            }
            else{
                c=1;
            }
            m=nums[i];
            v=Math.max(c,v);
        }
        m=52;
        c=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<m){
                c++;
            }
            else{
                c=1;
            }
            m=nums[i];
            v=Math.max(v,c);
        }
        return v;
    }
}