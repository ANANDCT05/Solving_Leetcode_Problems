class Solution {
    public int[] nextGreaterElements(int[] nums) {
        

        int st[]=new int [2*nums.length];
int top=-1;
        int n[]=new int[2*nums.length];

int k=2*nums.length-1;
        int i=0;

        while(i<2){
         int t=nums.length-1;

         while(t>=0){

           if(top==-1){
            n[k]=-1;
            st[++top]=nums[t];
           }

           else{
            while(top>=0 && nums[t]>=st[top]){
                top--;
            }

            if(top==-1){
                n[k]=-1;
                st[++top]=nums[t];
            }

            else{
                n[k]=st[top];

                st[++top]=nums[t];
            }
           }
           k--;
           t--;
         }
         i++;

        }
       

        
return Arrays.copyOfRange(n,0,nums.length);
 

    }
}