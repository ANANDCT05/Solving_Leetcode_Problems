class Solution {
    public int minBitFlips(int start, int goal) {
     int en=start ^goal;

     int count=0;
     while(en>0){
        if(en%2!=0){
            count++;
        }
        en=en>>1;
     }
return count;
    }
}