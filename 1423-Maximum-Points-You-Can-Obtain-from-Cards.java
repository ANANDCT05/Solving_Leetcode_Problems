class Solution {
    public int maxScore(int[] cardPoints, int k) {
                 int  l=cardPoints.length-k;
                 int r=cardPoints.length-1;
int sum=0;
   for(int i=l;i<=r;i++ ){
    sum=sum+cardPoints[i];
   }
   int max=sum;
   
                 while(r!=k-1){
                    sum=sum-cardPoints[l];
                    
   l=(l+1)%cardPoints.length;
   r=(r+1)%cardPoints.length;
                
      sum=sum+cardPoints[r];
     
                    if(sum>max){
                        max=sum;
                    }



                 }

                 return max;                                                   
    }
}