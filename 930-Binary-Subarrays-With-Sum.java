class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        HashMap<Integer,Integer>h1=new HashMap<>();
h1.put(0,1);
      int sum=0;  
int count=0;
        for(int i=0;i<nums.length;i++){

sum=sum+nums[i];

int n=sum-goal;

if(h1.get(n)!=null){
count=count+h1.get(n);
}

h1.put(sum,h1.getOrDefault(sum,0)+1);
    
        }

        return count;
    }
}