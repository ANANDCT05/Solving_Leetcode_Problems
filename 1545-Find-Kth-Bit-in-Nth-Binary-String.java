  class Solution {
    
    public char findKthBit(int n, int k) {

int t=(int)Math.pow(2,n)-1;
System.out.println(t);
      return check(t,n,k);
    }

    public char check(int t, int n,int k){

        if(t==1){
            return '0';
        }
   int mid=(t/2)+1;

   if(mid==k){
    return '1';
   }

   if(mid>k){
    return check(mid-1,n,k);
   }

   else {
int v=k-mid;
int f=mid-v;
  if(check(mid-1,n,f)=='1'){
    return '0';

  }
  else{
return '1';
  }
   }


     
    }
}