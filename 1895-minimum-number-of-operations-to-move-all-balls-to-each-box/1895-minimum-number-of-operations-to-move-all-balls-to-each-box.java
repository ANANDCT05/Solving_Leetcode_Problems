class Solution {
    public int[] minOperations(String boxes) {


       int one=0;
       int ope=0;
       int oner=0;
       int oper=0;
       int n=boxes.length()-1;
       int j=n;
       int ans[]=new int[n+1];
       for(int i=0;i<=n;i++){

        ope+=one;
        if(boxes.charAt(i)=='1'){
            one+=1;
        }

        ans[i]+=ope;
        oper+=oner;
        if(boxes.charAt(j)=='1'){
            oner+=1;
        }

        ans[j]+=oper;
        j--;
       } 

       return ans;
    }
}