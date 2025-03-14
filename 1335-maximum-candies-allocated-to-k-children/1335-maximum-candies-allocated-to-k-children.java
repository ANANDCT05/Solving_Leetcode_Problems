class Solution {
    public int maximumCandies(int[] candies, long k) {
        int max=0;
        for(int i=0;i<candies.length;i++){
            max=Math.max(candies[i],max);
        }

        int low=1;
        int high=max;
        while(low<=high){

            int mid=(low+high)/2;

            if(check(mid,k,candies)==true){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        
       
        return high;

    }


public static boolean check(int v,long k,int candies[]){

    for(int i=0;i<candies.length;i++){
        int q=candies[i]/v;
        k=k-q;
    }
if(k<=0){
    return true;
}
return false;
}

}
