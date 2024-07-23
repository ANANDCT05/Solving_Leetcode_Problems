class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low=1;
         int sum=0;
         int high=0;
        for(int i=0;i<weights.length;i++){
         sum+=weights[i];
        }


        high=sum;

        while(low<=high){
            int mid=(low+high)/2;

          int i=check(mid,days,weights);

          if(i==1){
            high=mid-1;
          }
          else{
            low=mid+1;
          }
        }
        return high+1;
    }



    public static int check(int p,int days,int[]weights){


        int day=0;
        int sum=0;
        for(int i=0;i<weights.length;i++){
       if(weights[i]>p){
        return -1;
       }

         sum+=weights[i];

         if(sum>p){
            day++;
            sum=weights[i];
         }




        }

        if(sum<=p){
            day++;
        }


        if(day<=days){
            return 1;
        }
        return -1;
    }
}