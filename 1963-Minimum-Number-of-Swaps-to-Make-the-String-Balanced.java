class Solution {
    public int minSwaps(String s) {
        





        int o=0;
        int m=0;

        for(int i=0;i<s.length();i++){

            if(s.charAt(i)=='['){
                o++;
            }
            else{
       if(o==0){
        m++;
       }
       else{
        o--;
       }
        }
        }
int t=m/2+m%2;
return t;

    }
}