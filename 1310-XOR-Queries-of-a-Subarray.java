class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int a[]=new int[queries.length];


int h[]=new int[arr.length+1];
int ans=0;
int l=0;
       for(int i=0;i<arr.length;i++){
ans=ans^arr[i];
h[i]=ans;
       }

       for(int i=0;i<queries.length;i++){

        int g=h[queries[i][1]];
        int e=queries[i][0]-1;
        int f=0;
        if(e>-1){
f=h[e];
        }
       
     
        a[l++]=g^f;
       }
return a;
    }
}