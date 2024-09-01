class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {

int l=0;

if(m*n!=original.length){
    return new int[0][0];
}
int a[][]=new int[m][n];
        for(int i=0;i<m;i++){

            for(int j=0;j<n;j++){
                
a[i][j]=original[l++];
            }
        }

        return a;
        
    }
}