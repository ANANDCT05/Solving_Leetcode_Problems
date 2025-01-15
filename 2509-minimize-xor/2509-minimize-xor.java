class Solution {
    public int minimizeXor(int num1, int num2) {
        
        int count=Integer.bitCount(num2);

        int a=Integer.bitCount(num1);
     
        if(count>=a){

int w=count-a;
           int t=num1;
int c1=t;
           int i=0;
           while(w>0){

            if(t%2==0){
            c1=c1^(1<<i);
            w--;
            }
            i++;
            t=t/2;
           }
        return c1;
        }

        else{
          int d=0;
          int v=a-count;
          int n=count;
          int t=num1;
          int c1=0;
          int i=0;
          while(n>0){
             
             if((t%2)==1){
                if(v>0){
                    v--;
                }
                else{
                    c1=c1^(1<<i);
                    n--;
                }
              
             }

             t=t/2;
             i++;
          }

          return c1;
          
        }
            }
}