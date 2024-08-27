import java.util.Arrays;
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> h1=new HashMap<>();

        for(int i=0;i<nums1.length;i++){
            h1.put(nums1[i],h1.getOrDefault(nums1[i],0)+1);
        }
        List<Integer> l1=new ArrayList<>();

        for(int i=0;i<nums2.length;i++){
            if(h1.get(nums2[i])!=null && h1.get(nums2[i])!=0){
                l1.add(nums2[i]);
                h1.put(nums2[i],0);
            }
        }

        return l1.stream().mapToInt(Integer::intValue).toArray();
    }
}