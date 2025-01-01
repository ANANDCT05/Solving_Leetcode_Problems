class Solution {
    public int maxScore(String s) {
        

    int t=0;
    for(int i=0;i<s.length();i++){

        if(s.charAt(i)=='1'){
            t++;
        }
    }

    int z=0;
    int tot=0;

    for(int i=0;i<s.length()-1;i++){
        if(s.charAt(i)=='1'){

            t--;
        }

        else{
            z++;
        }

        tot=Math.max(z+t,tot);
    }
    return tot;
    }
}