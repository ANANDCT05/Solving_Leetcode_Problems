class Solution {

    public int subarraysWithKDistinct(int[] nums, int k) {
        
        
   

        
       int  c1= check(nums,k); 
     
       

      
     int  c2=check(nums,k-1);
       

       return c1-c2;
       
    }

    public static int check( int nums[],int k ){

        int l=0;
        int r=0;
int count=0;
HashMap<Integer,Integer> h1=new HashMap<>();
        while(r<nums.length){

            h1.put(nums[r],h1.getOrDefault(nums[r],0)+1);



            while(h1.size()>k){
                h1.put(nums[l],h1.get(nums[l])-1);
                if(h1.get(nums[l])==0){
                    h1.remove(nums[l]);
                }
               l++;
               
            }
            count += r - l + 1;
            r++;
            
             
        }
        return count;
    }
}