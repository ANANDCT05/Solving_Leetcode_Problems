class Solution {
    public double myPow(double x, int n) {
        
        if(n==0){
            return 1.0;
        }
        double c=1.0;
        
        long a=n;
        if(a<0){
            a=-a;
        }

        while(a!=1){
   
         if(a%2!=0){
            c=c*x;
            a=a-1;
         }

         a=a/2;
         x=x*x;
         
           
        }

        if(n<0){
            return 1.0/(x*c);
        }

        return x*c;
    }
}