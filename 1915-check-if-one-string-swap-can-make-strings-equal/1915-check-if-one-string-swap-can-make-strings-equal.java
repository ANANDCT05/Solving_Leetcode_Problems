class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        
        int l=-1;
        int m=-1;
        int c=0;
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                c++;
                if(l==-1){
                    l=i;
                }
                else{
                    m=i;
                }
            }
        }

        if(c>2 || c==1){
            return false;
        }
       

        if( c==0 || (s1.charAt(l)==s2.charAt(m) && s1.charAt(m)==s2.charAt(l))){
            return true;
        }

        return false;
    }
}