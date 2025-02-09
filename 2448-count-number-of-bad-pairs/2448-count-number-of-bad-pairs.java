class Solution {
    public long countBadPairs(int[] nums) {
        
        HashMap<Integer,Integer>h1=new HashMap<>();
        long tot=0;
        int val=nums[nums.length-1]-(nums.length-1);
        h1.put(val,1);
        int tote=1;
        for(int i=nums.length-2;i>=0;i--){
        val=nums[i]-i;
        h1.put(val,h1.getOrDefault(val,0)+1);
            tote++;
        tot+=(tote-(h1.get(val)));
 
        }
        return tot;
    }
}