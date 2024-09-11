class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int sum=0;
HashMap<Integer,Integer> h1=new HashMap<>();
h1.put(0,-1);


        for(int i=0;i<nums.length;i++){
    sum=sum+(nums[i]);
    int r=sum%k;
    if(h1.get(r)!=null){
        int d=i-h1.get(r);
        if(d>1){
            return true;
        }
    }
else{
    h1.put(r,i);
}
        }

        return false;
    }
}