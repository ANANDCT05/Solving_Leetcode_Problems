class Solution {
    public boolean checkInclusion(String s1, String s2) {
        

        int ht[]=new int[26];
int t=0;
        for(int i=0;i<s1.length();i++){
            int c=s1.charAt(i)-'a';
            if(ht[c]==0){
          t++;
            }
               ht[c]++;
        }
     


        int j=0;
        int i=0;
        int l=0;
        int ht1[]=new int[26];

        while(j<s2.length()){

            int c=s2.charAt(j)-'a';
            
              ht1[c]++;
            if(ht[c]==ht1[c]){
              l++;
                if(t==l){
                    return true;
                }
            }
        

            while(i<=j && ht1[c]>ht[c]){
                int e=s2.charAt(i)-'a';
if(ht1[e]==ht[e]){
    l--;
}
                ht1[e]--;
                
                i++;
            }

            j++;
        }

       
        return false;
    }
}