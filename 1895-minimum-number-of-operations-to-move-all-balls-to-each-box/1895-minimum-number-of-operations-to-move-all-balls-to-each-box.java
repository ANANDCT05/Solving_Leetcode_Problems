class Solution {
    public int[] minOperations(String boxes) {
    

    int pref[]=new int[boxes.length()];
    int suf[]=new int[boxes.length()];
    int one=0;
    int ope=0;
    int oner=0;
    int oper=0;
    int j=boxes.length()-1;

    for(int i=0;i<boxes.length() && j>=0 ;i++){
   ope+=one;
        pref[i]=ope;
        if(boxes.charAt(i)=='1'){
            one+=1;
        }
oper+=oner;
        suf[j]=oper;
        if(boxes.charAt(j)=='1'){
            oner+=1;
        }
        j--;
    }
    int ans[]=new int [boxes.length()];
ans[0]=suf[0];
ans[boxes.length()-1]=pref[boxes.length()-1];
    for(int i=1;i<boxes.length()-1;i++){
         ans[i]=pref[i]+suf[i];
    }

    return ans;


        
    }
}