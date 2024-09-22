class Solution {
    public boolean reportSpam(String[] m, String[]b) {
        

        HashMap<String,Integer> h1=new HashMap<>();
int c=0;
        for(int i=0;i<b.length;i++){

            h1.put(b[i],1);
        }

        for(int i=0;i<m.length;i++){

            if(h1.get(m[i])!=null){
                c++;
                if(c==2){
                    return true;
                }
            }
        }

        return false;
    }
}