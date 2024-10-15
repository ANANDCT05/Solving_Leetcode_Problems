class Solution {
    public int trap(int[] height) {
        int st[]=new int[height.length];
        int c=0;

      int t=0;

      st[0]=height[height.length-1];
      int l=st[0];
int i=height.length-2;
      while(i>=0){
    if(height[i]>=l  ){
      

     if(t>0){
     
      while(t>0){
        c+= l-st[t];
        t--;
      }
      st[0]=height[i];
      l=height[i];
     }
     else{
        if(l==height[i] ){
        st[++t]=height[i];
        }

        else{
            t=0;
         st[t]=height[i];
         l=st[t];
        }

     }

    }

    else{
        st[++t]=height[i];
    }
    i--;
      }

      
      l=st[t];
      

      int st1[]=new int [height.length];
      int t1=0;
      st1[t1]=st[t];
      t--;
      while(t>=0){
       
        if(st[t]>=l){

            if(t1>0){
            
             while(t1>0){
                c+=(l-st1[t1]);
                t1--;
             }

             st1[0]=st[t];
             l=st[t];

            }


            else{
        
            if(l==st[t]){
                st1[++t1]=st[t];
            }
            else{
                t1=0;
                st1[t1]=st[t];
                l=st[t];
            }
            }
        }

        else{
            st1[++t1]=st[t];
        }
        t--;
      }
      return c;
    }
}