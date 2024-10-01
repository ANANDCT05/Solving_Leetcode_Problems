

class Solution {
    public boolean canArrange(int[] arr, int k) {
        

      int ht[]=new int[k+1];
      int c=0;
for(int i=0;i<arr.length;i++){

    int r=arr[i]%k;
    if(r<0){
        r=k+r;

    }
    int v=(k-r)%k;

if(ht[v]>0){
    c++;
    ht[v]--;
}
else{
    ht[r]++;
}

}

if(c==(arr.length)/2){
    return true;
}

return false;
      
         
          

    }
}