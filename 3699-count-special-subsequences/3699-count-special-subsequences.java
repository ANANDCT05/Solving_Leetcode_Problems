class Solution {
    public long numberOfSubsequences(int[] nums) {
        

        int q=0;
int p=0;
int s=0;
long ans=0;
int r=0;
HashMap<Double,Integer> h1=new HashMap<>();
        for(q=nums.length-5;q>=2;q--){
         r=q+2;

        for(s=r+2;s<nums.length;s++){
Double d=(double)nums[s]/nums[r];
            h1.put(d,h1.getOrDefault(d,0)+1);

        }

        for(p=q-2;p>=0;p--){

            double d=(double)nums[p]/nums[q];
            if(h1.get(d)!=null){
ans=ans+h1.get(d);
            }
        }
        }

        return ans;
    }
}