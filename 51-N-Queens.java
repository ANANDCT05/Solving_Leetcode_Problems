class Solution {
    public List<List<String>> solveNQueens(int n) {
        

        int n1 [][]=new int [n][n] ;

    List<List<String>>h1=new ArrayList<>();
      check(h1,n1,0,n);
    return h1;

    }


    public static void check(List<List<String>> h1,int[][]n1,int j,int n){

      if(j==n){
      List<String>l1=new ArrayList<>();
      for(int i=0;i<n;i++){

        StringBuilder s1=new StringBuilder();

        for(int k=0;k<n;k++){

            if(n1[i][k]==0){
                s1.append('.');
            }

            else{
                s1.append('Q');
            }
        }
l1.add(s1.toString());
        
      }

      h1.add(l1);
      return;

      }


      for(int a=0;a<n;a++){
      

        n1[a][j]=1;
        
        
        if(check1(n1,a,j)){
          check(h1,n1,j+1,n);
        }

        n1[a][j]=0;


      }

    }


    public static boolean check1(int n1[][],int i,int j){

        int r=i-1;
        int c=j-1;

        while(r>=0 && c>=0){

            if(n1[r][c]==1){
                return false;
            }

            r--;
            c--;
        }
  r=i+1;
  c=j-1;

        while(r<n1.length && c>=0){

            if(n1[r][c]==1){
                return false;
            }

            r++;
            c--;
        }


        r=i;
        c=j-1;

        while( c>=0){
            if(n1[r][c]==1){
                return false;
            }

            c--;
        }

        return true;
    }
}