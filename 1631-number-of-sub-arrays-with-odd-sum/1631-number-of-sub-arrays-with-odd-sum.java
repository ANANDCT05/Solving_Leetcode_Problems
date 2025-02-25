class Solution {
    public int numOfSubarrays(int[] arr) {
        


        int odd=0;
        int even=0;
       long ans=0;
          int c=0;

    

          for(int i=0;i<arr.length;i++){
    if(arr[i]%2!=0){

    
          int t=odd;
          odd=even+1;
          even=t;
          ans=(ans+odd)%(1000000007);
        
       
    }
    else{
        even++;
       
        ans=(ans+odd)%(1000000007);
      
    }

          }
     
   return (int)ans;
       

    }
}