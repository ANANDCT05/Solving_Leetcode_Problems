class Solution {
    public int maximumSwap(int num) {
        

        PriorityQueue<Pair<Integer,Integer>> n1=new PriorityQueue<>(Collections.reverseOrder());
        int arr[]=new int[11];

        StringBuilder s1=new StringBuilder(Integer.toString(num));
int l=-1;
int s=-1;
        for(int i=s1.length()-1;i>=0;i--){

            int v=s1.charAt(i)-'0';
            if(!n1.isEmpty()){
                Pair<Integer,Integer> v2=n1.poll();
                if(v<v2.getKey()){
                 l=i;
                 s=v2.getValue();
                 n1.add(v2);
                }
               else if(v==v2.getKey()){
                n1.add(v2);
               }
                else{
                    Pair<Integer,Integer> v3=new Pair(v,i);
                    n1.add(v3);
                }
            }

            else{

                Pair p1=new Pair(v,i);
                n1.add(p1);
            }


        }

        if(l==-1){
            return num;
        }

        else{
            char temp=s1.charAt(l);
            s1.setCharAt(l,s1.charAt(s));
            s1.setCharAt(s,temp);

            return Integer.parseInt(s1.toString());
        }
    }
}