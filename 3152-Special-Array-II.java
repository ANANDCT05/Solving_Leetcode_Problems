class Solution {
    public boolean[] isArraySpecial(int[] nums, int[][] queries) {
        

        for(int i=0;i<nums.length;i++){


            if((nums[i]%2)==0){
                nums[i]=0;
            }
            else{
                nums[i]=1;
            }
        }

        int p=-1;
        int c=0;

        for(int i=0;i<nums.length;i++){
        int    t=nums[i];
           if(nums[i]!=p){
            nums[i]=c;
           }
           else{
            c++;
            nums[i]=c;
           }
           p=t;
         
        }
        boolean v[]=new boolean[queries.length];
        

        for(int i=0;i<v.length;i++){

            int s=queries[i][0];
            int e=queries[i][1];

           int ans=nums[e]-nums[s];

            if(ans>0){
                v[i]=false;
            }

            else{
                v[i]=true;
            }
        }

        return v;


    }
}