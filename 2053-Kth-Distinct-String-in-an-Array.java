class Solution {
    public String kthDistinct(String[] arr, int k) {
        
        if(k>arr.length){
            return "";
        }
        HashMap<String,Integer> h1=new HashMap<>();

        for(int i=0;i<arr.length;i++){
            h1.put(arr[i],h1.getOrDefault(arr[i],0)+1);
        }

        for(int i=0;i<arr.length;i++){

            if(h1.get(arr[i])==1){
                k--;
                if(k==0){
                    return arr[i];
                }
            }
           
        }

        return "";
    }
}