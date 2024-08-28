class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int s=0;
        for(int i=0;i<apple.length;i++){
s+=apple[i];
        }
int l=0;

        Arrays.sort(capacity);
        for(int i=capacity.length-1;i>=0;i--){
            s=s-capacity[i];
            l++;
            if(s<=0){
                break;
            }
        }

        return l;
    }
}