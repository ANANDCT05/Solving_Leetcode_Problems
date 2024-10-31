class Solution {
    public int lengthOfLIS(int[] nums) {
        

        int arr[]=new int[nums.length];
        int t=0;
        arr[t]=nums[0];

        for(int i=1;i<nums.length;i++){
         int to=check(t,arr,nums[i]);
         
         if(to!=-1){
          if(to<=t){
            arr[to]=nums[i];
          }
          else{
        arr[++t]=nums[i];
          }

         }
        }

        return t+1;

    }

    public static int check(int t,int arr[],int e){
        int l=0;
        int h=t;
        while(l<=h){
            int mid=(l+h)/2;

            if(arr[mid]==e){
                return -1;
            }
            else if(arr[mid]>e){
                h=mid-1;
            }

            else{
                l=mid+1;
            }
        }

        return h+1;
    }
}
