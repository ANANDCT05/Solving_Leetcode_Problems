class Solution {
    public int[] sortJumbled(int[] mapping, int[] nums) {
        

        int n []=new int[nums.length];
    int k=0;
TreeMap<Integer,ArrayList<Integer>> h=new TreeMap<>();
        for(int i=0;i<nums.length;i++){
         
        int c=check(mapping,nums[i]);
        if(h.containsKey(c)){
            h.get(c).add(nums[i]);
        }

        else{
            ArrayList<Integer> a=new ArrayList<Integer>();
            a.add(nums[i]);
            h.put(c,a);
        }
      
         
         }
         for (Map.Entry<Integer,ArrayList<Integer> > entry : h.entrySet()) {
         ArrayList a=entry.getValue();
         int y=0;
while (y <a.size()) {
   n[k++]= (int)a.get(y);
    y++;
}
}
return n;
        
    }


    public static int check(int m[],int n){
         int num=0;
        int i=1;

        if(n==0){
            return m[0];
        }
         while(n>0){
            
            int l=m[n%10];
            num=num+(l* i);
            n=n/10;
            i=i*10;
         }
return num;
    }
}