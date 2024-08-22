class Solution {
    public long minOperations(int[] nums1, int[] nums2, int k) {
        

        long c=0;
        long c2=0;


        for(int i=0;i<nums1.length;i++){

            int d=nums1[i]-nums2[i];
            
        
            if( k!=0 && d%k!=0 ){
               
                return -1;
            }

            if(d<0){
                if(k!=0){
            c+=Math.abs(d/k);
                }
                else{
                    return -1;
                }
            }

            else{
                if(k!=0){
                c2+=d/k;
                }
                else{
                    if(d!=0){
                    return -1;
                }
            }
        }
        }
         

         if(c!=c2){
            return -1;
         }

         return c2;



    }
}