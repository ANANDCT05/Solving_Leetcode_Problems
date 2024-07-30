class Solution {
    public boolean isPowerOfTwo(int n) {
        double x=Math.log10(n)/Math.log10(2);
        if((int)x==x){
            return true;
        }
        else{
            return false;
        }
    }
}