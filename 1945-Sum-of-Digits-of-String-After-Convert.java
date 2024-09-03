class Solution {
    public int getLucky(String s, int k) {
        

        int sum=0;
        int n=s.length();

        for(int i=0;i<n;i++){
            int a=(s.charAt(i)-96);
            sum=sum+(a%10);
            sum=sum+(a/10);
        }

        k--;
       int num=sum;
       
        while(k>0){
      sum=0;
      while(num>0){
        sum=sum+(num%10);
        num=num/10;
      }

      num=sum;
      k--;


        }
       

        return sum;
    }
}