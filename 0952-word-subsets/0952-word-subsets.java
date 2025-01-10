class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        List<String>l1=new ArrayList<>();


      int ht[]=new int[26];
      int tem[]=new int[26];
      for(int i=0;i<words2.length;i++){
        String s=words2[i];
        int len=s.length();
        for(int j=0;j<len;j++){

            int ind=s.charAt(j)-'a';
            tem[ind]++;
        }

for(int l=0;l<26;l++){
    ht[l]=Math.max(ht[l],tem[l]);
    tem[l]=0;
}

      }

      for(int i=0;i<words1.length;i++){
   String s=words1[i];
        int len=s.length();
        for(int j=0;j<len;j++){
            int ind=s.charAt(j)-'a';
            tem[ind]++;
        }
int e=0;
        for(int l=0;l<26;l++){

            if(ht[l]<=tem[l]){
                e++;
            }
tem[l]=0;
        }

        if(e==26){
            l1.add(words1[i]);
        }
      }

      return l1;
      
    }
}