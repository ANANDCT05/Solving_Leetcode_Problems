class FindSumPairs {


HashMap<Integer,Integer>h1;

int nums1[];
int nums2[];

    public FindSumPairs(int[] nums1, int[] nums2) {
        this.nums1=nums1;
        this.nums2=nums2;
        h1=new HashMap<>();
        for(int i=0;i<nums2.length;i++){

            h1.put(nums2[i],h1.getOrDefault(nums2[i],0)+1);
        }
    }
    
    public void add(int index, int val) {
        

        h1.put(nums2[index],h1.get(nums2[index])-1);
       
        nums2[index]+=val;
          h1.put(nums2[index],h1.getOrDefault(nums2[index] ,0)+1);
    }
    
    public int count(int tot) {
        int count=0;

        for(int i=0;i<nums1.length;i++){
           

            count+=h1.getOrDefault(tot-nums1[i],0);
        }
        return count;
    }
}

/**
 * Your FindSumPairs object will be instantiated and called as such:
 * FindSumPairs obj = new FindSumPairs(nums1, nums2);
 * obj.add(index,val);
 * int param_2 = obj.count(tot);
 */