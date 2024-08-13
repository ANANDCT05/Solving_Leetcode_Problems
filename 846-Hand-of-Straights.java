class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        PriorityQueue<Integer> p1=new PriorityQueue<>();

        if(hand.length%groupSize!=0){
            return false;
        }
HashMap<Integer,Integer> h1=new HashMap<>();

for(int i=0;i<hand.length;i++){
    h1.put(hand[i],h1.getOrDefault(hand[i],0)+1);
}


Arrays.sort(hand);

for(int i=0;i<hand.length;i++){

    if(h1.get(hand[i])!=0){
       if(! check(hand[i]+1,groupSize-1,h1)){
        return false;
       }
      h1.put(hand[i],h1.get(hand[i])-1);

    }
}

return true;
    }


public static boolean check(int e,int s,HashMap<Integer,Integer> h1){
int t=1;

while(t<=s){
if(h1.get(e)==null || h1.get(e)==0){

    return false;
}
h1.put(e,h1.get(e)-1);
e++;
t++;
}
return true;
}
}