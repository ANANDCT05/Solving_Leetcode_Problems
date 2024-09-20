class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length<=2){
            return nums.length;
        }
        HashMap<Integer,Integer> h1=new HashMap<>();
Set<Integer> s1=new LinkedHashSet<>();
int count=0;
        for(int i=0;i<nums.length-1;i++){
       s1.add(nums[i]);
       if(nums[i]==nums[i+1]){
        h1.put(nums[i],2);
        while(i< nums.length-1 && nums[i]==nums[i+1]){
            i++;
        }
       }

       else{
        h1.put(nums[i],1);
       }
           

 }

 if(nums[nums.length-1]!=nums[nums.length-2] ){
 s1.add(nums[nums.length-1]);
 h1.put(nums[nums.length-1],1);
 }
int i=0;
Iterator <Integer> h=s1.iterator();

while(h.hasNext()){

    int e=h.next();
    int c=h1.get(e);
    while(c>0){
        nums[i++]=e;
        c--;
    }
}

return i;

    }
}