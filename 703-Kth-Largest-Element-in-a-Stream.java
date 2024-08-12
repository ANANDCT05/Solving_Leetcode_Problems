class KthLargest {
int k;
PriorityQueue<Integer>p1=new PriorityQueue<>();
    public KthLargest(int k, int[] nums) {
       this.k=k;
      for(int i:nums){
        p1.add(i);
      }
      
    }
    
    public int add(int val) {

       p1.add(val);

       while(p1.size()>k){
        p1.poll();
       }

        return p1.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */