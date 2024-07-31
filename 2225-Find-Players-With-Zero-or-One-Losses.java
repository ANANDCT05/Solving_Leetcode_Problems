class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        List<List<Integer>> l1=new ArrayList<>();
        List<Integer>l2=new ArrayList<>();
        List<Integer>l3=new ArrayList<>();
        HashMap<Integer,Integer> h1=new HashMap<>();

        for(int i=0;i<matches.length;i++){

            h1.put(matches[i][1],h1.getOrDefault(matches[i][1],0)+1);
        }


        for(int i=0;i<matches.length;i++){

            if(h1.get(matches[i][0])==null){
                l3.add(matches[i][0]);
                h1.put(matches[i][0],2);
            
            }

            if(h1.get(matches[i][1])!=null && h1.get(matches[i][1])==1){
                l2.add(matches[i][1]);
            }
        }

      Collections.sort(l3);
      Collections.sort(l2);
        l1.add(l3);
          l1.add(l2);
        return l1;
    }
}