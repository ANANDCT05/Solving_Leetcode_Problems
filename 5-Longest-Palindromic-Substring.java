class Solution {
    int en=-1;
    int st=-1;
     int len=1;
    public String longestPalindrome(String s) {
        

   for(int i=1;i<s.length();i++){

     
     check(i-1,i+1,s);
     check(i-1,i,s);
   }

   if(en!=-1){

    return s.substring(st,en+1);
   }

   return s.substring(0,1);
  
    }


    public  void check(int i,int j,String s){

        if(i<0 || j==s.length()){
            return ;
        }


        if(s.charAt(i)==s.charAt(j)){
            if((j-i+1)> len){
                len=j-i+1;
                en=j;
                st=i;
            }

            check(i-1,j+1,s);
        }
       return ;
    }

}