class Solution {
    public boolean canConstruct(String s, int k) {
        

        
if(s.length()<k){
    return false;
}
if(s.length()==k){
    return true;
}
 int ht[]=new int[26];
        for(char c:s.toCharArray()){

            int ind=c-'a';
            ht[ind]++;
        }
int g=0;
        for(int i=0;i<26;i++){

            if((ht[i]%2)!=0){
                g++;
            }

            if(g>k){
                return false;
            }
        }
        return true;
    }
}