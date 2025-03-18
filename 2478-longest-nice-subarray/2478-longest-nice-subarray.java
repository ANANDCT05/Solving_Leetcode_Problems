class Solution {
    public int longestNiceSubarray(int[] nums) {

       int l=0;
       int r=1;
       int k=0;
       int max=1;
       while(r<nums.length){
         k=l;
         while(k<r){
            if((nums[k] & nums[r])==0){
                k++;
            }
            else{

                l=k+1;
                break;

            }
         }

         if(k!=r){
            continue;
         }

         max=maxlen(max,r-l+1);
         r++;



        
       }
       return max;
    }

    public static int maxlen(int a,int b){
        if(a>b){
          return  a;
        }
        else{
            return b;
        }
    }
}