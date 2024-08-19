class Solution {
    public int countKConstraintSubstrings(String s, int k) {
        
        int nz=0;
        int no=0;
        int sum=0;
   int j=0;
   int len=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0'){
                nz++;
            }
            else {
                no++;
            }
            if(no<=k || nz<=k){
                len++;
            }
            else{

                while(nz>k && no>k){
                sum=sum+(s.length() -i);

                if(s.charAt(j)=='0'){
                    nz--;
                }
                else{
                    no--;
                }
                j++;

                }
            }
        }
             
           
        int t=(s.length()*(s.length()+1))/2;
        t=t-sum;
        return t;
    }
}