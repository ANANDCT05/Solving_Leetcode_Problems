class Solution {
    public int minimizedMaximum(int n, int[] quantities) {
        
        int sum=0;
        for(int i=0;i<quantities.length;i++){
          sum= Math.max(sum,quantities[i]);
        }
        int l=1;
        int h=sum;


        while(l<=h){

            int mid=(l+h)/2;

            if(check(mid,n,quantities)){
                    h=mid-1;
            }

            else{
                   l=mid+1;
            }
        }

        return l;


    }


    public static boolean check(int mid,int n,int nums[]){
 


   
       int e=0;
      
       for(int i=0;i<nums.length;i++){
            if(nums[i]>mid){
        e=e+(nums[i]/mid);

        if(nums[i]%mid>0){
            e=e+1;
        }
  
   
            }
            else if(nums[i]==mid){
                e=e+1;
                
            }

            else{
                e=e+1;
            }
       }

       if(e<=n){
        return true;
       }

       return false;

    }
}