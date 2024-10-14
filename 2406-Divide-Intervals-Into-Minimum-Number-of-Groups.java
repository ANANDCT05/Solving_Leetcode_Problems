class Solution {
    public int minGroups(int[][] intervals) {
        
        int st[]=new int[intervals.length];
        int en[]=new int[intervals.length];
   for(int i=0;i<intervals.length;i++){
     st[i]=intervals[i][0];
     en[i]=intervals[i][1];
   }

   Arrays.sort(st);
   Arrays.sort(en);
   int c=0;
int ans=Integer.MIN_VALUE;
 int i=0;
 int j=0;

 while(i<intervals.length ){
    if(st[i]<=en[j]){
        c++;
        ans=Math.max(c,ans);
        i++;
    }
    else{
        c--;
        j++;
    }
    
 }

 return ans;

 
    }
}