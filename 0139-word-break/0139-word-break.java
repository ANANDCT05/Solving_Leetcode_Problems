class Solution {

    int e;
    Solution t[];
    Solution(){
        t=new Solution[26];
        e=-1;
    }
    public boolean wordBreak(String s, List<String> wordDict) {
        Boolean dp[]= new Boolean[s.length()];
        Solution e1=new Solution();
        for(int i=0;i<wordDict.size();i++){

            insert(wordDict.get(i),e1);
        }

        return check(dp,s,e1,0);
    }

    public static boolean check(Boolean dp[],String s,Solution e,int i){

        if(i==s.length()){
            return true;
        }

        if(dp[i]!=null){
            return dp[i];

        }
boolean ans=false;
Solution r=e;
        for(int j=i;j<s.length();j++){

            int in=s.charAt(j)-'a';
            if(r.t[in]==null){
                break;
            }

            r=r.t[in];
            if(r.e==1){

              ans=  check(dp,s,e,j+1);
              if(ans==true){
                return true;
              }
            }
        }

       return  dp[i]=ans;
    }


    public static void insert(String s,Solution r){

        for(int i=0;i<s.length();i++){

            int in=s.charAt(i)-'a';
            if(r.t[in]==null){
                Solution c=new Solution();

                r.t[in]=c;
                r=c;
            }
            else{
                r=r.t[in];
            }
        }

        r.e=1;
    }
}