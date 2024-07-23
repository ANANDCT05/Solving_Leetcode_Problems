class Solution {
    public int[] frequencySort(int[] nums) {
        
        HashMap<Integer,Integer>h1=new HashMap<>();
       for(int i=0;i<nums.length;i++){
        h1.put(nums[i],h1.getOrDefault(nums[i],0)+1);
       }

       for(int i=0;i<nums.length;i++){
        for(int j=0;j<nums.length-1-i;j++){
           
          if(h1.get(nums[j])>h1.get(nums[j+1])){
            int t=nums[j];
            nums[j]=nums[j+1];
            nums[j+1]=t;
          }
          else if(h1.get(nums[j])==h1.get(nums[j+1])){
            if(nums[j]<nums[j+1]){
                int t=nums[j];
                nums[j]=nums[j+1];
                nums[j+1]=t;
            }
          }

        }
       }
       return nums;
    }

    
}