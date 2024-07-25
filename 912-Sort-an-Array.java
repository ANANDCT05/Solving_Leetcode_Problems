class Solution {
    public int[] sortArray(int[] nums) {
        

         merge(nums,0,nums.length-1);
         return nums;

    }


    public static void merge(int nums[],int low,int high){

        if(low<high){
        int mid=(low+high)/2;
        merge(nums,low,mid);
          merge(nums,mid+1,high);
          mergeSort(nums,low,mid,high);
        }
    }



    public static void mergeSort(int nums[],int l,int mid,int h){


        int t[]=new int[h-l+1];
        int i=l;
        int j=mid+1;

       int k=0;
        while(i<=mid && j<=h){
            

            if(nums[i]<nums[j]){
                t[k++]=nums[i];
                i++;
            }

            else{
                t[k++]=nums[j];
                j++;
            }

        }


        while(i<=mid){
            t[k++]=nums[i];
            i++;
        }
     while(j<=h){
        t[k++]=nums[j];
        j++;
     }
k=0;

     for(int m=l;m<=h;m++){
       nums[m]=t[k++];
     }
    }
}