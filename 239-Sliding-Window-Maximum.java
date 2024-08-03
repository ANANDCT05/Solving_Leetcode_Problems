class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int l=0;
        int r=k-1;
        int arr[]=new int[nums.length];
int t=-1;
int max=find(l,r,nums);
arr[++t]=nums[max];

        while(r<nums.length-1){

           r++;
           if(max==l){
           max= find(l+1,r,nums);
           }
         else if(nums[r]>=nums[max]){
            max=r;
           }
           arr[++t]=nums[max];
           l++;
             
            
           }

           return Arrays.copyOfRange(arr,0,t+1);
          
        }
    


public static int find(int l,int r,int nums[]){

    int m=l;
    l=l+1;

    while(l<=r){
        if(nums[l]>=nums[m]){
            m=l;
        }
        l++;
    }

    return m;
}
}