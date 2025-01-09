class Solution {
    public String longestPalindrome(String s) {
      boolean dp[][]=new boolean[s.length()][s.length()];

      int st=-1;
      int e=-1;
  int len=0;
int n=s.length();

for(int g=0;g<n;g++){

for(int i=0,j=g;j<n && i<n;i++,j++){
  
  if(i==j){
    dp[i][j]=true;
  }

  else if(j==i+1){
    dp[i][j]=(s.charAt(i)==s.charAt(j))?true:false;
  }
  else{
    if(s.charAt(i)==s.charAt(j)  && dp[i+1][j-1]){
        dp[i][j]=true;
    }
    else{
        dp[i][j]=false;
    }
  }

  if(dp[i][j] && (j-i+1)>len){
    st=i;
    e=j;
    len=j-i+1;
  }
    
}


}


return s.substring(st,e+1);



    }
}