class Solution {
    public int[][] diagonalSort(int[][] mat) {
        

        for(int i=mat.length-1;i>=0;i--){

            check(i,mat,0);
        }

        for(int j=mat[0].length-1;j>=1;j--){
            check(0,mat,j);
        }

        return mat;
    }

    public static void check(int i,int [][]mat,int j){

        int r=i;
        int c=j;
        List<Integer> l1=new ArrayList<>();
  while(r<mat.length && c<mat[0].length){
    l1.add(mat[r][c]);
    r++;
    c++;
  }

  Collections.sort(l1);

  int k=0;
  r=i;
  c=j;
    while(r<mat.length && c<mat[0].length){
    mat[r][c]=l1.get(k);
    r++;
    c++;
    k++;
       
    }

    }
}