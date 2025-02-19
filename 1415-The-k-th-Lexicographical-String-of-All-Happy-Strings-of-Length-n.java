class Solution {
    public String getHappyString(int n, int k) {
        char prev='z';
        List<StringBuilder>l1=new ArrayList<>();
        check(n,new StringBuilder(),l1,prev);
        if(l1.size()<k){
            return "";
        }
        return l1.get(k-1).toString();
    }


    public static void check(int n,StringBuilder s2,List<StringBuilder>l1,char c){

        if(s2.length()==n){

            l1.add(new StringBuilder(s2));
            return;
        }

        for(char z='a';z<='c';z++){
            if(c!=z){
                s2.append(z);
                check(n,s2,l1,z);
                s2.deleteCharAt(s2.length()-1);
            }
        }
        

    }
}