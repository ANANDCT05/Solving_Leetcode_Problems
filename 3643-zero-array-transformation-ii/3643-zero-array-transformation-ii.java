class Solution {
    public int minZeroArray(int[] nums, int[][] queries) {
        int flag=0;
      
        int low=-1;
        int high=queries.length-1;
        while(low<=high){
            int mid=(low+high)/2;

            if(check(mid,queries,nums)==true){
               
                high=mid-1;
            }
            else{
         
                low=mid+1;
            }
        }
        if(low==queries.length){
            return -1;
        }
       
        return  low+1;
    }
    public static boolean check(int mid,int queries[][],int nums[]){
  
            int ans[]=new int[nums.length];
            for(int i=0;i<=mid;i++){
                int st=queries[i][0];
                int end=queries[i][1]+1;
                int v=queries[i][2];
                ans[st]-=v;
                
                if(end<ans.length){
                    ans[end]+=v;
                }

            }

            int x=0;
            for(int i=0;i<nums.length;i++){
                x=x+ans[i];
               
                if((nums[i]+x)>0){
                    return false;
                }
            }
            return true;

    }


}