class Solution {
    public int[] findPeakGrid(int[][] mat) {
        
      
       
    return check(mat,0,0);

    }



    public static int [] check(int mat[][],int i,int j){
    

     if(!checks(mat,i,j-1,mat[i][j])){
     return  check(mat,i,j-1);
     }  

     if(!checks(mat,i,j+1,mat[i][j])){
         return check(mat,i,j+1);
     }

     if(!checks(mat,i-1,j,mat[i][j])){
return check(mat,i-1,j);
     }

     if(!checks(mat,i+1,j,mat[i][j])){
return check(mat,i+1,j);
     }

     return new int[]{i,j};
    
    }


    public static boolean checks(int  mat[][],int i,int j, int d ){


        if(i==mat.length || i==-1){
            return true;
        }

        if(j==-1 || j==mat[0].length){
            return true;
        }

        if(mat[i][j]>d){
            return false;
        }
        return true;
    }
}