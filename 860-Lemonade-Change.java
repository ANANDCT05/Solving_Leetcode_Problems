class Solution {
    public boolean lemonadeChange(int[] bills) {
       int f=0;
       int t=0;
       
       for(int i=0;i<bills.length;i++){

    if(bills[i]==5){
        f++;
    }
    else if(bills[i]==10){
        t++;
    }
    
    int r=bills[i]-5;
     
       if(r==15){
        if(f<1 ){
           return false;
        }

        if(t<1){
            if(f<3){
                return false;
            }

            f=f-3;
        }
        else{
            f--;
            t--;
        }

        
       }
       else if(r==10){
        if(t<1 && f<2 ){
            return false;
        }
        if(t>=1){
            t--;
        }
        else{
            f--;
            f--;
        }
       }
       else if(r==5){
        if(f<1){
            return false;
        }
        f--;
       }

       }

       return true;


          
            
        }
    }
