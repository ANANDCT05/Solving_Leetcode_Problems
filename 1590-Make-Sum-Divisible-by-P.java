class Solution {
    public int minSubarray(int[] nums, int p) {
        long sum=0;
   
    for(int i=0;i<nums.length;i++){
   sum=sum+nums[i];

    }

    long r=sum%p;
    if(sum<p){
        return -1;
    }
    if(r==0){
        return 0;
    }
    long d=p-r;
HashMap<Long,Integer> h1=new HashMap<>();

h1.put((long)0,-1);

 sum=0;
int min=nums.length;

for(int i=0;i<nums.length;i++){
sum=sum+nums[i];

long e=sum%p;

if(e>=r){
    long f=e-r;

    if(h1.get(f)!=null){
        min=Math.min(min,i-h1.get(f));
    }

}

else{
    long v=d+e;

    if(h1.get(v)!=null){
        min=Math.min(min,i-h1.get(v));
    }
}

h1.put(e,i);

}


if(min!=nums.length){
    return min;
}

return -1;

    


    }


}