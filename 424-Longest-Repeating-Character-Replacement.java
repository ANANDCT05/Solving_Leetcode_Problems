class Solution {
    public int characterReplacement(String s, int k) {
        
   int hash[]=new int[26];
        int h=0;
    int max=0;
    int l=0;
    int r=0;
        while(r<s.length()){
          
          hash[s.charAt(r)-'A']++;

          if(hash[s.charAt(r)-'A']>h){
            h=hash[s.charAt(r)-'A'];
          }
     
        if(r-l+1-h >k){

            hash[s.charAt(l)-'A']--;
            
            l++;
            h=0;

            for(int i=0;i<26;i++){
                if(hash[i]>h){
                    h=hash[i];
                }
               
            }


        }

        max=Math.max(max,r-l+1);
        r++;


         
        }

        return max;

    }
}