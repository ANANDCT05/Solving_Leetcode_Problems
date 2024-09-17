class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        
List<String > l1=new ArrayList<>();
        String arr1[]=s1.split(" ");
        String arr2[]=s2.split(" ");

        HashMap<String,Integer> h1=new HashMap<>();
         HashMap<String,Integer> h2=new HashMap<>();

         for(int i=0;i<arr1.length;i++){
            h1.put(arr1[i],h1.getOrDefault(arr1[i],0)+1);
         }

         for(int i=0;i<arr2.length;i++){
            h2.put(arr2[i],h2.getOrDefault(arr2[i],0)+1);
         }

         for(int i=0;i<arr1.length;i++){

            if(h1.get(arr1[i])==1 && h2.get(arr1[i])==null){
                l1.add(arr1[i]);
            }
         }
for(int i=0;i<arr2.length;i++){

            if(h2.get(arr2[i])==1 && h1.get(arr2[i])==null){
                l1.add(arr2[i]);
            }
         }
    

    String[] arr = new String[l1.size()];
        arr = l1.toArray(arr);

        return arr;
}
}