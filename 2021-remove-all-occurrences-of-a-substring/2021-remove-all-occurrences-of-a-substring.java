class Solution {
    public String removeOccurrences(String s, String part) {
           
        StringBuilder s1=new StringBuilder(s);
        int ind=-1;
        while( (ind=s1.indexOf(part))!=-1){
            s1.delete(ind,ind+part.length());

        }

        return s1.toString();

    }
}