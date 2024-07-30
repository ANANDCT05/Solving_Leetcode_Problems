class Solution {
    public void rotate(int[][] matrix) {
        

        int l=matrix[0].length;
        int n[][]=new int[l][l];
int k=0;
       while(k<l){
            for(int j=l-1;j>=0;j--){
                n[k][l-j-1]=matrix[j][k];
            }
            k++;
       }
        

        for(int i=0;i<l;i++){
            for(int j=0;j<l;j++){
                matrix[i][j]=n[i][j];
            }
        }


    }
}