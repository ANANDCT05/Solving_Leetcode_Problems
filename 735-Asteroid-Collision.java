class Solution {
    public int[] asteroidCollision(int[] a) {
        

        int st[]=new int[a.length];
        int t=-1;


        for(int i=0;i<a.length;i++){

            if(a[i]>=0){
                st[++t]=a[i];
            }
            else{
                int l=-a[i];
               while(t>=0 && l>st[t] && st[t]>0){
                t--;
               }

               if(t==-1 || st[t]<0){
                st[++t]=a[i];
               }
               else if(l==st[t]){
                  t--;
               }
            }
        }


        return Arrays.copyOfRange(st,0,t+1);
    }
}