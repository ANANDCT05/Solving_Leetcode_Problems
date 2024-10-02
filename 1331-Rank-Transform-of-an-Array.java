class Solution {
    public int[] arrayRankTransform(int[] arr) {


   int t[] = arr.clone();

   Arrays.sort(t);
   HashMap<Integer,Integer> h1=new HashMap<>();
   int c=1;
   for(int i=0;i<t.length;i++){
    h1.put(t[i],c);

    while(i<arr.length-1 && t[i]==t[i+1]){
        i++;
    }

    c++;
   }


   for(int i=0;i<arr.length;i++){

arr[i]=h1.get(arr[i]);
   }

   return arr;
    }
}