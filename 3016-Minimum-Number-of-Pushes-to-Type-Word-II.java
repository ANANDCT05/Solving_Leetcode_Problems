class Solution {
    public int minimumPushes(String w) {
        

       int f[]=new int [26];
       


        for( int i=0;i<w.length();i++){
           f[w.charAt(i)-97]++;
         }
    
Arrays.sort(f);




         int c=1;
         int d=1;
         int sum=0;

         for(int i=f.length-1;i>=0 && f[i]!=0;i--){
            if(c>8){
                d+=1;
                c=1;
            }
            sum=sum+(f[i]*d);
            c++;

         }
return sum;

        
    }
}