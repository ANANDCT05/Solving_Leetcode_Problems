class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        
   
int count=0;
      for(int i=0;i<words.length;i++){

        for(int j=i+1;j<words.length;j++){

            if(words[i].length()>words[j].length()){
                continue;
            }
            String s1=words[j].substring(0,words[i].length());
            String s2=words[j].substring(words[j].length()-words[i].length(),words[j].length());
            if(s1.equals(words[i]) && s2.equals(words[i])){
                count++;
            }
        }
      }

      return count;
    }
}