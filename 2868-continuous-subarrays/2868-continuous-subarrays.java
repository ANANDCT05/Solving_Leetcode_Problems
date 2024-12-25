class Solution {
    public long continuousSubarrays(int[] nums) {
      
        
  Deque<Integer>d1=new ArrayDeque<>();
  Deque<Integer>d2=new ArrayDeque<>();
   

   int l=0;
   int r=0;
   long ans=0;

   while(r<nums.length){


    while(!d1.isEmpty() &&  nums[d1.peekLast()]<=nums[r]){
        d1.pollLast();
    }
    d1.addLast(r);
 
    while(!d2.isEmpty() &&  nums[d2.peekLast()]>=nums[r]){
        d2.pollLast();
    }
    d2.addLast(r);

    while(nums[d1.peekFirst()]-nums[d2.peekFirst()]>2){

        l++;
        if(d1.peekFirst()<l)d1.pollFirst();
        else if(d2.peekFirst()<l)d2.pollFirst();
    }

ans+=(r-l+1);
r++;
   }
  
return ans;
    }
}