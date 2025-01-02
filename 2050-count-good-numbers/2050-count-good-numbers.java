class Solution {
    public int countGoodNumbers(long n) {

        if(n<2){
            return 5;
        }
        
       long a=20;
       long c=n/2;

      long sum=check(c,a);
if(n%2!=0){

    sum=(sum*5)%(1000000007);
}
      return (int )sum;
    }


    public static long check(long c,long a){

        if(c==1){
            return a;
        }

        if(c%2!=0){

            return (a*(check( c/2,(a*a)%(1000000007) )))%(1000000007);
        }
        else{
             return (check( c/2,(a*a)%(1000000007) ))%(1000000007);
        }
    }
}