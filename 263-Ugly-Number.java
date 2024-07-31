class Solution {
    public boolean isUgly(int n) {
  

  if(n<=0){
    return false;
  }
       
       if(check(n)){
        return true;
       }

       return false;

    }




public static boolean check(int a){

    while(a%2==0){
        a=a/2;
    }

    while(a%3==0){
        a=a/3;
    }

    while(a%5==0){
        a=a/5;
    }

    if(a==1){
        return  true;
    }
    return false;
}







}