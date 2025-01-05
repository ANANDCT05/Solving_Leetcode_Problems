class Solution {
    public long maximumCoins(int[][] coins, int k) {


        

   Arrays.sort(coins, (a, b) -> Integer.compare(a[0], b[0]));
   
int n=coins.length;

   int j=0;
long ans=0;
long p=0;
long max=0;
   for(int i=0;i<n;i++){
p=0;
    while(j<n && coins[i][0]+k-1>=coins[j][1]){

        ans+=  (long)(coins[j][1]-coins[j][0]+1)*(coins[j][2]);
        j++;
    }

    if(j<n){
         p=(long)Math.max(0, coins[i][0]+k-1 -(coins[j][0]) +1)*coins[j][2];
       
    }
    max=Math.max(ans+p,max);
    ans-=(long)(coins[i][1]-coins[i][0]+1)* (long)coins[i][2];
   }

  
  
j=coins.length-1;
ans=0;
   for(int i=coins.length-1;i>=0;i-- ){
   p=0;
   long pp=coins[i][1]-k+1;
  
   while(j>=0 && pp<=coins[j][0]){
    ans+=(long)(coins[j][1]-coins[j][0]+1)*(coins[j][2]);
    j--;
   }
if(j>=0){
    p=(long)Math.max(0,coins[j][1]-pp+1)*(coins[j][2]);
}

max=Math.max(max,ans+p);

ans-=(long)(coins[i][1]-coins[i][0]+1)*(coins[i][2]);
   }

   return max;

    }
}