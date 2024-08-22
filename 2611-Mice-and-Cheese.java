class Solution {
    public int miceAndCheese(int[] reward1, int[] reward2, int k) {
        
        int sum=0;
        int a[]=new int [reward2.length];

        for(int i=0;i<reward2.length;i++){
            sum+=reward2[i];

            a[i]=reward1[i]-reward2[i];
        }

        Arrays.sort(a);

        for(int i=a.length-1;k>0;i--){
            sum+=a[i];
            k--;
        }

        return sum;

    }
}