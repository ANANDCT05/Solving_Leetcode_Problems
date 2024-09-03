class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        


      int l=0;
      int r=matrix[0].length-1;
return bs(matrix,l,r,target);
     
      }
    

    public static boolean bs(int m[][],int l,int r,int t){


        if(l<r){

        int mid=(l+r)/2;

        if(m[0][mid]==t){
            return true;
        }

        else if(t<m[0][mid]){
         return bs(m,l,mid-1,t);
        }

        else{
           return bs(m,l,mid,t)|| bs(m,mid+1,r,t);
        }
        }

        else{
           return check1(m,l,t);
        }

    }


    public static boolean check1(int m[][],int j,int t){


          int l=0;
          int r=m.length-1;


          while(l<=r){
            int mid=(l+r)/2;

            if(m[mid][j]==t){
                return true;
            }

            else if(m[mid][j]>t){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
          }

        

        return false;
    }

    
        
      
}