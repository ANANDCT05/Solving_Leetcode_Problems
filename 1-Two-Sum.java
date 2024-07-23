class Solution {
    public int[] twoSum(int[] nums, int target) {
        

        HashMap<Integer,Integer> a1=new HashMap<>();

        for(int i=0;i<nums.length;i++){

            if( a1.containsKey(nums[i])){
                return new int[] {i,a1.get(nums[i])};
            }

            a1.put(target-nums[i],i);
        }
        return null;
    }
} 