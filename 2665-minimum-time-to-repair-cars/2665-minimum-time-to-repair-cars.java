class Solution {
    public long repairCars(int[] ranks, int cars) {
        int max=0;
        for(int i=0;i<ranks.length;i++){
            max=Math.max(ranks[i],max);
        }
        long low=1;
        long high=max*((long)cars *cars);
        while(low<high){
           long mid=(low)+(high-low)/2;
          if( check(mid,cars,ranks)){
              high=mid;
           }
           else{
            low=mid+1;
           }
        }

        return high;
    }

    public static boolean check(long tot,int cars,int ranks[]){
        long count=0;
        for(int i=0;i<ranks.length;i++){
            long val=tot/ranks[i];
            long can=(long)(Math.sqrt(val));
            count+=can;
            if(count>=cars){
                return true;
            }
        }
        return false;
    }
}