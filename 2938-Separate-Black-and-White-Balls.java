class Solution {
    public long minimumSteps(String s) {
        
        int i=0;
        int j=0;

        long c=0;

        while(j<s.length()){

            if(s.charAt(j)=='0'){
                c+=j-i;
                i++;
            }

            j++;
        }
        return c;
    }
}