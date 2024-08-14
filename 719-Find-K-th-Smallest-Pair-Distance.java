class Solution {
    public int smallestDistancePair(int[] nums, int k) {
        
     Arrays.sort(nums);


     int h=nums[nums.length-1]-nums[0];
     int l=0;
     int f=Integer.MAX_VALUE;
    

     while(l<=h){
        int m=(l+h)/2;

       int count =check(nums,m,k);

        if(count>=k){
       f=Math.min(f,m);
       h=m-1;
        }
        else{
            l=m+1;
        }

     }

     return f;
    }

    public static int  check(int nums[],int e,int k){
int c=0;
        for(int i=0;i<nums.length;i++){
                
            for(int j=i+1;j<nums.length;j++){

                int d=Math.abs(nums[i]-nums[j]);

                if(d<=e){
                    c++;

                    if(c==k){
                        return c;
                    }
                   
                }

                if(d>e){
                    break;
                }
            }
        }
        return c;
    }
}