class Solution {
    public boolean isCircularSentence(String sentence) {
        String s1[]=sentence.split(" ");
        

        for(int i=0;i<s1.length;i++){
int j=(i+1)%s1.length;
if(s1[i].charAt(s1[i].length()-1)!=s1[j].charAt(0)){
    return false;
}
        }
        return true;
    }
}