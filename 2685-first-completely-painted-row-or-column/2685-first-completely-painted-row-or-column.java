class Solution {
    public int firstCompleteIndex(int[] arr, int[][] mat) {
        
int n=mat.length;
int m=mat[0].length;
        int r[]=new int[n];
        int c[]=new int[m];

        HashMap<Integer,ArrayList<Integer>>h1=new HashMap<>();
        for(int i=0;i<n;i++){

            for(int j=0;j<m;j++){
                ArrayList<Integer> a1=new ArrayList<>();
                a1.add(i);
                a1.add(j);
                h1.put(mat[i][j],a1);
            }
        }

        for(int i=0;i<arr.length;i++){
            ArrayList<Integer> a1=h1.get(arr[i]);
            r[a1.get(0)]++;
            if(r[a1.get(0)]==m){
                return i;
            }
            c[a1.get(1)]++;
           
            if(c[a1.get(1)]==n){
                return i;
            }
        }

        return 0;
    }
}