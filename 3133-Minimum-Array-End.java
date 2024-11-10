class Solution {
    public long minEnd(int n, int x) {


        n=n-1;
        long a=x;
        int i=0;
       

        while(n>0){
            
            if(((1L<<i) & a)==0){
                int b= (1)&n;
                
                if(b==1){
                long e= (1L<<i);
                
              
                a=  a^e;
                }
                n=n/2;
                
            }
            i++;
        }

        return a;
        
    }
}