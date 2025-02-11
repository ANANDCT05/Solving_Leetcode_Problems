class Solution {
    public int findLongestChain(int[][] pairs) {



      int p=-1001;

   Comparator<int[]>c1=new Comparator<>(){

    public int compare(int a[],int b[]){

        if(a[0]>b[0]){
            return 1;
        }
        else if(a[0]==b[0]){
            if(a[1]>b[1]){
                return 1;
            }
            return -1;
        }

        return -1;
    }
   }; 
   Arrays.sort(pairs,c1);
   int dp[]=new int[pairs.length];
   
 
Arrays.fill(dp,-1);
return check(0,dp,pairs,p);

    }

    public static int check(int i,int dp[],int p[][],int pr){

        if(i==p.length){
            return 0;
        }
int t=0;

        if(pr<p[i][0] && dp[i]!=-1){
           t=dp[i];
        }

        else if(pr<p[i][0]){
             t=check(i+1,dp,p,p[i][1])+1;
        }
        int not=check(i+1,dp,p,pr);
        if(t!=0){
            dp[i]=t;
        }
        return Math.max(not,t);
    }
}