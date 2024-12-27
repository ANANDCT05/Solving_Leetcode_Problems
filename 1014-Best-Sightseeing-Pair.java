class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int m=values[0];
        int l=0;

        for(int i=1;i<values.length;i++){

            if((values[i]-i+m)>l){
                l=values[i]-i+m;
            }

            if(values[i]+i>m){
                m=values[i]+i;
            }
        }

        return l;
    }
}