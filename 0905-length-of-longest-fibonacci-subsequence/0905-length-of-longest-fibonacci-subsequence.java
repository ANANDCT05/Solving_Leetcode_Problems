class Solution {
    public int lenLongestFibSubseq(int[] arr) {
       HashMap<Long,Integer>h1=new HashMap<>();
       for(int i=0;i<arr.length;i++){
        h1.put((long)arr[i],1);
       }
int max=0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){

                long f1=arr[i];
                long f2=arr[j];
                int c=2;
                long s=arr[i]+arr[j];
                while(h1.get(s)!=null){
                    c++;
                    long t=s;
                    s=f2+s;
                    f2=t;
                }
                max=Math.max(c,max);
            }
           
        }
        if(max==2){
                return 0;
            }

         return max;
    }
}
