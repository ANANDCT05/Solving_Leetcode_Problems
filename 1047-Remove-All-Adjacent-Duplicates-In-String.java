class Solution {
    public String removeDuplicates(String s) {
        char st[]=new char[s.length()];
        int t=-1;


        for(int i=0;i<s.length();i++){
            int f=0;
            while(t!=-1 &&st[t]==s.charAt(i) ){
                t--;
                f=1;
            }

            if(f==0){
                st[++t]=s.charAt(i);
            }
        }

        StringBuilder sb=new StringBuilder();
        for(int i=0;i<=t;i++){
        sb.append(st[i]);
        }

        return sb.toString();
    }
}