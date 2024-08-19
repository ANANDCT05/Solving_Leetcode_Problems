class Solution {
    public int minSteps(int n) {
        

        if(n==1){
            return 0;
        }

        int t=n;

        int i=2;
        int count=0;
        while(i<=t){

            if(isprime(i)){
             

             while(t%i==0){
                count=count+i;
                t=t/i;
             }
            }
            i++;
        }

        return count;
    }


    public static boolean isprime(int a){

        for(int i=2;i<(int)Math.sqrt(a)+1;i++){

            if(a%i==0){
                return false;
            }
        }

        return true;
    }
}