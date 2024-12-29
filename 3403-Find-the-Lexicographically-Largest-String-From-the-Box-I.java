class Solution {
    public String answerString(String word, int numFriends) {

        int max=word.length()-(numFriends-1);
     if(numFriends==1){
         return word;
     }
        char a= (char)96;

        ArrayList<Integer> a1=new ArrayList<>();
        for(int i=0;i<word.length();i++ ){

            if(word.charAt(i)>a){
                a1=new ArrayList<>();
                a1.add(i);
                a=word.charAt(i);
            }
            else if(word.charAt(i)==a){
                a1.add(i);
            }
        }
  int l=word.length()-a1.get(0);
    StringBuilder s1=new StringBuilder(word.substring(a1.get(0),Math.min(l,max)+a1.get(0)));
        for(int i=1;i<a1.size();i++){

               l=word.length()-a1.get(i);
            StringBuilder s2=new StringBuilder(word.substring(a1.get(i),Math.min(l,max)+a1.get(i)));
          int r=  s1.compareTo(s2);

            if(r<0){
                s1=s2;
            }
        }

        return s1.toString();
    }
}