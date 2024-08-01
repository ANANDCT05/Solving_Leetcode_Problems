class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        

        int low=0;
        int high=(matrix[0].length * matrix .length )-1;

        while(low<=high){

            int mid=(low+high)/2;
            int i=mid/(matrix[0].length);
            int j=mid-(matrix[0].length*i);

            if(matrix[i][j]==target){
                return true;
            }

            else if(matrix[i][j]>target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }

        return false;
    }
}