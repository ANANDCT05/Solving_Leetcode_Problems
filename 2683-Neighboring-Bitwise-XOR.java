class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        
       
     int pos=0;
        int j=1;
        int i=0;
        int f=0;
        while(i<derived.length){

          int need=derived[i]^pos;
          i++;
          pos=need;
        }
        if(pos==0){
            return true;
        }
        pos=1;
        i=0;
        while(i<derived.length){
            int need=derived[i]^pos;
            i++;
            pos=need;
        }
        if(pos==1){
            return true;
        }
        return false;

    }
}