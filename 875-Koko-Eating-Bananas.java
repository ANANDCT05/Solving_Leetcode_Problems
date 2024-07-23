class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max=piles[0];

      for(int i=1;i<piles.length;i++){
         if(piles[i]>max){
             max=piles[i];
         }
      }

      int low=1;
      int high=max;

      int min=max;
    

      while(low<=high){
        int mid=(low+high)/2;

       int i=check(mid,piles,h);
       if(i==1){
        high=mid-1;
        min=Math.min(min,mid);


       }
       else {
        low=mid+1;
       }
      }

      return min;
    }



    public static int check(int k,int piles[],int h){


        long s=0;

        for(int i=0;i<piles.length;i++){

           s+=piles[i]/k;
           if(piles[i]%k!=0){
            s+=1;
           }
        }

        if(s<=h){
            return 1;
        }

        return 0;
    }
}