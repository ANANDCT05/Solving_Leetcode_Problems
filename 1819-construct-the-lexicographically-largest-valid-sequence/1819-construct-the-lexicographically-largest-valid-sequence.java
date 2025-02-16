class Solution {
    static int max[];
    public int[] constructDistancedSequence(int n) {
    max=new int[(n*2) -1];
    int b=1;

    int arr[]=new int[(n*2) -1];
    check(arr,b,0,(n*2) -1, n);
    return max;
    }

    public static boolean check(int arr[],int b,int c,int tot,int n){

if(c==tot){

    if(Integer.bitCount(b)==n+1){

            max=Arrays.copyOf(arr,tot);
        
    }
    return true;
}
if(arr[c]!=0){
  return  check(arr,b,c+1,tot,n);
}

        for(int i=n;i>=1;i--){

            if(i!=1){

                if((b &(1<<i))==0 && ( (c+i) <tot) && arr[c+i]==0 && arr[c]==0 ){
                    arr[c]=i;
                    arr[c+i]=i;
                    b=b^(1<<i);
               
                  boolean ans=  check(arr,b,c+1,tot,n);
                    if(ans==true){
                        return true;
                    }
                    b=b^(1<<i);
                    arr[c]=0;
                    arr[c+i]=0;
                }
            }
            else{
                
                if(arr[c]==0 && (b&(1<<i))==0){
                  b=b^(1<<i);
                  arr[c]=1;
              
                  
             boolean ans=check(arr,b,c+1,tot,n);
             if(ans==true){
                return true;
             }
                b=b^(1<<i);
                arr[c]=0;
                    
                }
            }
        }

        return false; 
    }
}