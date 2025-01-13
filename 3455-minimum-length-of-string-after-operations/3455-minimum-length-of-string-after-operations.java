class Solution {
    public int minimumLength(String s) {
        

        int ht[]=new int[26];
int r=0;
        for(int i=0;i<s.length();i++ ){

            int ind=s.charAt(i)-'a';
            ht[ind]++;
        }

        for(int i=0;i<26;i++){
            if(ht[i]>=3){

                if(ht[i]%2==0){
                    r=r+2;
                }
                else{
                    r=r+1;
                }
            }
            else{
                r=r+ht[i];
            }
        }

        return r;
        
    }
}