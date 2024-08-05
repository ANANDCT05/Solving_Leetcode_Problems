class Solution {
    public int sumSubarrayMins(int[] arr) {

        long t[]=new long [arr.length];
        long c[]=new long [arr.length];
        long st[]=new long [arr.length];
        int top=-1;
        long sum=0;
        for(int i=arr.length-1;i>=0;i--){
          
            long f=1;
             while(top>=0 && arr[i]<st[top]){
                sum=(sum+(st[top]*c[top]*t[top]))%(1000000007);
                f=c[top]+f;
                top--;
             }
        st[++top]=arr[i];
        c[top]=f;
        t[top]=1;
        int l=top-1;
        while(l>=0 && arr[i]>=st[l]){
            t[l]+=1;
            l--;
        }

        }
        
    

    while(top>=0 ){
        sum=(sum+(st[top]*t[top]*c[top]))%(1000000007);
        top--;
    }
    return (int)sum;
    }
}