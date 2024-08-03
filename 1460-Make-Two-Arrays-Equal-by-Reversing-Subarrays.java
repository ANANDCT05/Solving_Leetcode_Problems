class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        
        int ht[]=new int[1001];
        for(int i=0;i<arr.length;i++){
           ht[target[i]]++;
        }

        for(int i=0;i<arr.length;i++){
          if(ht[arr[i]]==0){
           return false; 
          }
          ht[arr[i]]--;
        }
        return true;
    }
}