class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        

        int arr[]=new int[A.length];


        int h[]=new int[A.length+1];
        int k=0;
        for(int i=0;i<A.length;i++){
     if(h[A[i]]==1){
        k++;
     }
     else{
        h[A[i]]++;
     }

     if(h[B[i]]==1){
        k++;
     }
     else {
        h[B[i]]++;
     }
         arr[i]=k;
        }


        return arr;
    }
}