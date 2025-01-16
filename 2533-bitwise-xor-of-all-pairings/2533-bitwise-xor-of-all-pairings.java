class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {

int xor=0;
     for(int i=0;i<nums2.length;i++){
        xor=xor^(nums2[i]);
     }   
     for(int i=0;i<nums1.length;i++){

        if((nums2.length%2)==1){
            nums1[i]=nums1[i]^(xor);
        }
        else{
          nums1[i]=xor;
        }
     }

     int f=0;
     for(int i=0;i<nums1.length;i++){
        f=f^(nums1[i]);
     }

     return f;
    }
}