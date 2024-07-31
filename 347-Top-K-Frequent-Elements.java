class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        

        int n1[]=new int [nums.length];
HashMap<Integer,Integer> h1=new HashMap<>();

        for(int i=0;i<nums.length;i++){
         h1.put(nums[i],h1.getOrDefault(nums[i],0)+1);
        }

 Set<Integer> keys = h1.keySet();

        int l=0;
        for (Integer key : keys) {
            n1[l]=key;
            l++;
        }


        for(int i=0;i<l;i++){
            for(int j=0;j<l-1-i;j++){

                if(h1.get(n1[j]) <h1.get(n1[j+1])){
                    int t=n1[j];
                    n1[j]=n1[j+1];
                    n1[j+1]=t;
                }
            }
        }
int e[]=new int[k];

        for(int i=0;i<k;i++){
            e[i]=n1[i];
        }


   return e;

       

    }
}