class Solution {
    public int maxArea(int[] height) {
        int i=0;
        int j=height.length-1;

        int ans=Integer.MIN_VALUE;
       
        while(i<j){

            int a=Math.min(height[i],height[j])*(j-i);
            ans=Math.max(a,ans);
            if(height[i]<height[j]){
                i++;
        }
        else{
            j--;
        }
        }

        return ans;

    }
}