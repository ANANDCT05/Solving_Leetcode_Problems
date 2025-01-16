class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {

int xor=0;
     for(int i=0;i<nums2.length;i++){
        xor=xor^(nums2[i]);
     }   
    int aor=0;
    for(int i=0;i<nums1.length;i++){
        aor=aor^(nums1[i]);
    }

    if(nums2.length%2==1){

        if(nums1.length%2==0){
    return aor;
        }
        else{
            return aor^xor;
        }
    }
    else{
        if(nums1.length%2==0){
            return 0;
        }
        else{
            return xor;
        }
    }
    }
}