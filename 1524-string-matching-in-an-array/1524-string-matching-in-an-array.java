class Solution {
    public List<String> stringMatching(String[] words) {
        
          String s1=String.join(" ",words);
        List<String> l1=new ArrayList<>();
        for(int i=0;i<words.length;i++){

            if(s1.indexOf(words[i])!=s1.lastIndexOf(words[i])){

                l1.add(words[i]);
            }
        }

        return l1;
    }
}