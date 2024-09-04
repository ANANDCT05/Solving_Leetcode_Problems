class Solution {
    public int numberOfAlternatingGroups(int[] colors) {


    int l=0;
    int r=2;
    int count=0;
    int n=colors.length;
    while(l<n){

        if(colors[l]!=colors[(l+1)%n] && colors[(l+1)%n]!=colors[r] && colors[l]==colors[r]){
         count++;
        }
        l++;
        r=(r+1)%n;
    }
    return count;
    }
}