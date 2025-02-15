class Solution {
    static int dp[]=new int[1001];


    public int punishmentNumber(int n) {
        
int ans=0;
for(int i=n;i>=1;i--){
   int v= check(i);
   if(v==1){
    ans+=(i*i);
  
   }
}

return ans;
    }
    public static int check(int n){
      
        if(dp[n]!=0){
            return dp[n];

        }

        boolean f=ch1(n,Integer.toString(n*n),0,0);
        if(f==false){
            dp[n]=-1;
        }
      else{
        dp[n]=1;
      }

      return dp[n];
          
    }
    public static boolean ch1(int ne,String s,int i,int sum){
    if(i==s.length()){
        if(sum==ne){
            return true;
        }
        return false;
    }

    for(int j=i;j<s.length();j++){
       int v=Integer.parseInt(s.substring(i,j+1));
       if((sum+v)<= ne){
       boolean ans= ch1(ne,s,j+1,sum+v);
       if(ans==true){
        return true;
       }
       }
    }

    return false;

    
    }
}