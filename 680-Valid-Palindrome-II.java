class Solution {
    public boolean validPalindrome(String s) {
        if(s.length()<3){
            return true;
        }
        return check(s,0,s.length()-1,0);
        

        

       
        
    }

    public static boolean check(String s ,int l,int h,int c){

        if(c>1){
            return false;
        }
    if(l>=h){
        return true;
    }

    if(s.charAt(l)!=s.charAt(h)){
      return  check(s,l+1,h,c+1)||check(s,l,h-1,c+1);
    }

    return check(s,l+1,h-1,c);
    }
}