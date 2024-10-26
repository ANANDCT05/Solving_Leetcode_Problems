class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);

        int min=Integer.MAX_VALUE;
        int ans=0;

        for(int i=0;i<nums.length;i++){

            int t=target-nums[i];

            int f=0;
            int j=i+1;
            int k=nums.length-1;

            while(j<k){

                int a=nums[j]+nums[k];

                int d=Math.abs(t-a);

                if(d<min){
                    ans=nums[i]+a;
                    min=d;
                }

                if(a==t){
                    f=1;
                    break;
                }

                else if(a>t){
                    k--;
                }

                else{
                    j++;
                }
            }

            if(f==1){
                break;
            }
        }

        return ans;
    }
}