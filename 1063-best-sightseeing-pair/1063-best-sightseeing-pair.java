class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        

        int arr[]=new int [values.length];
         int e[]=new int[values.length];
int max=0;

int k=values[values.length-1]-(values.length-1);
int m=Integer.MIN_VALUE;
int j=values.length-2;
         for(int i=0;i<values.length-1;i++){
 max=Math.max(max,values[i]+i);
arr[i]=max;
m=Math.max(m,k);
e[j]=m;
k=values[j]-j;
j--;
         }
max=0;

         for(int i=0;i<values.length;i++){
            max=Math.max(arr[i]+e[i],max);
         }

         return max;
    }
}