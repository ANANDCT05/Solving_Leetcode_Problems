class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);

        int arr[]=new int[deck.length];
        Arrays.fill(arr,-1);
int j=-1;
int n=1;
        for(int i=0;i<deck.length;i++){
    
    

    while(n<2){

        j=(j+1)%deck.length;
        if(arr[j]==-1){
            n++;
        }
    }
       n=0;

        arr[j]=deck[i];

        }

        return arr;
    }
}