class Solution {
    public List<String> stringMatching(String[] words) {
        

        List<String> s1=new ArrayList<>();

        for(int i=0;i<words.length;i++){

            for(int j=0;j<words.length;j++){
if(i!=j){

    if(words[j].contains(words[i])){
        s1.add(words[i]);
        break;
    }
}
            }
        }

        return s1;
    }
}