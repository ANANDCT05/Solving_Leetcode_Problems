class Solution {
    public int mincostTickets(int[] days, int[] costs) {
        Integer dp[][]=new Integer[days.length][days[days.length-1]+31];
        return check(0,days,costs,dp,0);
    }

    public static int check(int s,int []d,int []c,Integer dp[][],int i){

        if(i==d.length){
            return 0;
        }

        if(dp[i][s]!=null){

            return dp[i][s];
        }

        if(s>d[i]){
            return dp[i][s]=check(s,d,c,dp,i+1);
        }

        else{

         
            int one=check(d[i]+1,d,c,dp,i+1)+c[0];
        
            int fo=check(d[i]+7,d,c,dp,i+1)+c[1];
        
            int se=check(d[i]+30,d,c,dp,i+1)+c[2];


            int ans=Math.min(one,Math.min(fo,se));

            return dp[i][s]=ans;
        }
    }
}