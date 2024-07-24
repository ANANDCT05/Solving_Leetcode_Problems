class Solution {
    public int maxDepth(String s) {
        

        int o=0;
        int max=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);

            if(c=='('){
                o++;
                max=Math.max(max,o);
            }

            else if(c==')'){
                o--;
            }
        }
        return max;
    }
}