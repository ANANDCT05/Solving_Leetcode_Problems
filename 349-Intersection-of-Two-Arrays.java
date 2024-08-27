import java.util.Arrays;
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
      List<Integer>l1=new ArrayList<>();

      Arrays.sort(nums1);
      Arrays.sort(nums2);

      for(int i=0;i<nums2.length;i++){

        if(check(i,nums1,nums2)){
            l1.add(nums2[i]);

            while(i<nums2.length-1 && nums2[i]==nums2[i+1]){
                i++;
            }
        }

              }

        return l1.stream().mapToInt(Integer::intValue).toArray();
    }


    public static boolean check(int i,int []nums1,int[] nums2){
        int le=0;
        int ri=nums1.length-1;
        int t=nums2[i];

        while(le<=ri){

            int m=(le+ri)/2;
            if(nums1[m]==t){
return true;
            }

           else if(t>nums1[m]){
                le=m+1;
            }
            else{
                ri=m-1;
            }
        }
        return false;
    }
}