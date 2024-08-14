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
       
int i=0;
for(int j=1;j<nums.length;j++){

    int d=nums[j]-nums[i];

    if(d<=e){
        c=c+j-i;
    }

    else{
        while(i<j && nums[j]-nums[i]>e){
            i++;
        }

c=c+(j-i);

    }
}

return c;
    }
}