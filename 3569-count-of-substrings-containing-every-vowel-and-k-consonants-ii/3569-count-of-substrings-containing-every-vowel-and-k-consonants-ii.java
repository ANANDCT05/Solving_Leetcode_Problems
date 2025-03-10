class Solution {
    public long countOfSubstrings(String word, int k) {
         return  help(k,word) -help(k+1,word);
    }
  public static boolean isvowel(char a){

    if(a=='a' || a=='e' || a=='i'|| a=='o'|| a=='u'){
        return true;
    }
    return false;
  }
    public static long help(int k,String word){
        long v=0;
        int ht[]=new int[26];
        int left=0;
        int right=0;
        int f=0;
        int vo=0;
        int c=0;
        while(left<word.length() && right<word.length()){
   char ch=word.charAt(right);
        if(f==0){
            if(isvowel(ch)){
                ht[ch-'a']++;
                if(ht[ch-'a']==1){
                    vo++;
                }
            } 
            else{
                c++;
            }
         }

         if(c>=k && vo==5){
            v+=(word.length()-right);
            
             ch=word.charAt(left);
             if(isvowel(ch)){
                ht[ch-'a']--;
                if(ht[ch-'a']==0){
                    vo--;
                }
             }
             else{
                c--;
             }
             left++;
             f=1;

         }
         else{
            f=0;
            right++;
         }
        }

        return v;
    }
}