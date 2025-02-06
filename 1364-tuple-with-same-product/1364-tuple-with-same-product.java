class Solution {
    public int tupleSameProduct(int[] nums) {
        
        HashMap<Integer,Integer>h1=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                int val=nums[i]*nums[j];
                h1.put(val,h1.getOrDefault(val,0)+1);
            }
        }
        int count=0;
     for(Map.Entry<Integer,Integer>m1:h1.entrySet()){
        if(m1.getValue()>1){
          int tot=((m1.getValue()-1)*(m1.getValue()))/2;
          count=count+(tot*8);
        }
     }

     return count;

    }
}