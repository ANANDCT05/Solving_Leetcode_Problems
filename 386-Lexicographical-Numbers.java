class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<String> h1=new ArrayList<>();

        for(int i=1;i<=n;i++){
            h1.add(Integer.toString(i));
        }
        Collections.sort(h1);

        List<Integer> l1=new ArrayList<>();

        for(int i=0;i<n;i++){
            l1.add(Integer.parseInt(h1.get(i)));
        }
        return l1;
        
         }
}