class Solution {
    public int numberOfSubstrings(String s) {
    int hash[]=new int[3];
         int count=0;
         int l=0;
         int r=0;

         int v=0;


         while(r<s.length()){
if(hash[s.charAt(r)-'a']==0){
    v++;
}

hash[s.charAt(r)-'a']++;
           



                while(v==3){

                    count =count+s.length()-r;
                   hash[s.charAt(l)-'a']--;

                   if(hash[s.charAt(l)-'a']==0){
                    v--;
                   }
                    l++;
                }
            
            r++;

         }
         return count;
    }
    }
