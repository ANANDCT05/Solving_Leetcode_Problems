class Solution {

    Solution t[];
    int en=-1;
    Solution(){
        t=new Solution[26];
    }
    public int minExtraChar(String s, String[] d) {

Solution s1=new Solution();

insert(d,s1);

int dp[]=new  int[s.length()];

Arrays.fill(dp,-1);
int v=check(0,s,dp,s1);

return s.length()-v;



    }

    public static int check(int i , String s , int dp[],Solution s1){

        if(i==s.length()){
            return 0;
        }
    if(dp[i]!=-1){
        return dp[i];
    }
        Solution s4=s1;
   int m=0;

   for(int j=i;j<s.length();j++){

     int v=s.charAt(j)-'a';
     if(s4.t[v]!=null){
        if(s4.t[v].en==1){
            m=Math.max(m,check(j+1,s,dp,s1)+(j-i+1));
            
        }
        s4=s4.t[v];
        
    
     }
     else{
        break;
     }
   }

   m=Math.max(m,check(i+1,s,dp,s1));
return dp[i]=m;
       
    }

    public static void insert(String[] d,Solution s1 ){

        for(int i=0;i<d.length;i++){

            String m=d[i];
            Solution s=s1;

            for(int j=0;j<m.length();j++){

                int v=m.charAt(j)-'a';
                if(s.t[v]==null){

                    Solution s4=new Solution();
                    s.t[v]=s4;
                    s=s4;
                }

                else{
                    s=s.t[v];
                }
            }

            s.en=1;
        }
    }
}
