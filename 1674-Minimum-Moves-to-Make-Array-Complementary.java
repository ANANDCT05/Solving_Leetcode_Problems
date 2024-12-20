class Solution {
    public int minMoves(int[] nums, int limit) {
        
        


        int i=0;
        int j=nums.length-1;
       int arr[]=new int [2*limit+1];
      
        while(i<j){

            int zero=nums[i]+nums[j];
            int min=Math.min(nums[i],nums[j])+1;
            int max=Math.max(nums[i],nums[j])+limit;
     
            if(min!=zero){
              
            arr[min]=arr[min]+1;

            
            arr[zero]=arr[zero]-1;
          
            }
            
            if(max!=zero ){
          arr[zero+1]+=1;
            if(max+1<=2*limit)
             arr[max+1]-=1;
            
            }

            if(min-1>=2){
                arr[2]+=2;
  
               arr[min]-=2;
            }

            if(max+1<= 2*limit){
               arr[max+1]+=2;
                
            }

            i++;
            j--;

        }

        int min=nums.length+1;

        int sum=0;

   for( i=2;i<=(2*limit);i++){
    sum=sum+(arr[i]);
   
    min=Math.min(sum,min);

   }

    return min;


     
    }
    
}