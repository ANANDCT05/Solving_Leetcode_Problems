class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        
        HashMap<Integer,Integer>h1=new HashMap<>();

        for(int i=0;i<arr.length;i++){
            h1.put(target[i],h1.getOrDefault(target[i],0)+1);
        }

        for(int i=0;i<arr.length;i++){
            if(h1.get(arr[i])==null || h1.get(arr[i])==0){
                return false;
            }
            h1.put(arr[i],h1.get(arr[i])-1); 
        }
        return true;
    }
}