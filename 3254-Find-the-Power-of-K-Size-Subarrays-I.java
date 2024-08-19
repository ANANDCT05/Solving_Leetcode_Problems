class Solution {
    public int[] resultsArray(int[] nums, int k) {
        
int arr[]=new int[nums.length-k+1];
        int ns[]=new int[nums.length];
        find(ns,nums);

        for(int i=0;i<arr.length;i++){

            int ind=ns[i]-i;

            if(ind<k){
                arr[i]=-1;
            }
            else{
int j=i+1;
int t=1;
int flag=0;
                while(t<k){ 
                    if(nums[j]-nums[j-1]!=1){
                        flag=1;
                        break;
                    }
                    j++;
                    t++;
                }

                if(flag==0){
                    arr[i]=nums[j-1];
                }
                else{
                    arr[i]=-1;
                }
            }

        }
        return arr;
    }


    public static void find(int ns[],int nums[]){

        int st[]=new int[nums.length];
        int t=-1;

        for(int i=nums.length-1;i>=0;i--){

            while(t>=0 && nums[st[t]]>=nums[i]){
                t--;
            }

            if(t==-1){
                ns[i]=nums.length;

            }
            else{
          ns[i]=st[t];
            }

            st[++t]=i;
        }
    }
}