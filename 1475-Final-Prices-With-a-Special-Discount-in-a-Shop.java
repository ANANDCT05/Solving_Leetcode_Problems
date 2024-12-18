class Solution {
    public int[] finalPrices(int[] prices) {
        int arr[]=new int[prices.length];
int f=0;

        for(int i=0;i<prices.length;i++ ){
f=0;
            for(int j=i+1;j<prices.length;j++){

                if(prices[j]<=prices[i]){

                    arr[i]=prices[i]-prices[j];
                    f=1;
                    break;
                }
            }
            if(f==0){
arr[i]=prices[i];
            }
        }

        return arr;
    }
}