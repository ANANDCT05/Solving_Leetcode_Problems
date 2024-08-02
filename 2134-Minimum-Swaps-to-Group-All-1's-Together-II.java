class Solution {
    public int minSwaps(int[] nums) {
        
    int o=0;

    for(int i=0;i<nums.length;i++){

        if(nums[i]==1){
            o++;
        }
    }

    int l=0;
    int r=o-1;
int ze=0;


for(int i=0;i<=r;i++){
    if(nums[i]==0){
        ze++;
    }
}
int min=ze;
    do {
        if(nums[l]==0){
            ze--;
        }
        l=(l+1)%nums.length;
        r=(r+1)%nums.length;
        if(nums[r]==0){
            ze++;
        }
    if(ze<min){
        min=ze;
    }
    
    }while(l!=0);

    return min;
     
    }
}