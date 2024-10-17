class Solution {
    public int maximumSwap(int num) {
        
     int temp=num;
        int max=num%10;
        num=num/10;
        int mi=0;
   
int t=0;
int l=-1;
int s=-1;
        while(num>0){
            int v=num%10;
            t++;
     if(v<max){
        l=t;
        s=mi;
     }
     else if(v>max){
        max=v;
        mi=t;
     }

     num=num/10;
        }

        if(l==-1){
            return temp;
        }
   

        StringBuilder s1=new StringBuilder(Integer.toString(temp));
         
        char c=s1.charAt(t-l);
      
       s1.setCharAt(t-l,s1.charAt(t-s));
        s1.setCharAt(t-s,c);

        return Integer.parseInt(s1.toString());
    }
}