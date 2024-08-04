class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        

      int n1[]=new int[(n*(n+1))/2];
int sum=0;
int k=0;
      for(int i=0;i<n;i++){
   sum=0;
   for(int j=i;j<n;j++){
 sum+=nums[j];
 n1[k++]=sum;
   }
      }

      Arrays.sort(n1);
long s=0;
      for(int i=left-1;i<right;i++){
s=(s+n1[i])%(1000000007);
      }



return (int)s;

    }
}