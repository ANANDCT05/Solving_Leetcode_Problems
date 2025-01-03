class Solution {
    public int waysToSplitArray(int[] nums) {
        
long tot=0;
        for(int i=0;i<nums.length;i++){
    tot=tot+nums[i];
        }

        int v=0;
long s=0;
        for(int i=0;i<nums.length-1;i++){
s=s+nums[i];
tot=tot-nums[i];
if(s>=tot){
    v++;
}
        }

        return v;
    }
}