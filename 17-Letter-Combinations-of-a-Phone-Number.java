class Solution {
    public List<String> letterCombinations(String digits) {
        String s[]=new String[digits.length()];
        int k=0;

        List<String> l1=new ArrayList<>();
        if(digits.length()==0){
return l1;
        }
        for(int i=0;i<digits.length();i++){
          
      if(digits.charAt(i)=='2'){
        s[i]=\abc\;
      }

     else if(digits.charAt(i)=='3'){
        s[i]=\def\;
      }
      else if(digits.charAt(i)=='4'){
        s[i]=\ghi\;
      }

      else if(digits.charAt(i)=='5'){
        s[i]=\jkl\;
      }
      else if(digits.charAt(i)=='6'){
        s[i]=\mno\;
      }

      else if(digits.charAt(i)=='7'){
        s[i]=\pqrs\;
      }

      else if(digits.charAt(i)=='8'){
        s[i]=\tuv\;
      }
      else{
        s[i]=\wxyz\;
      }

        }
StringBuilder s1=new StringBuilder();
        check(s,l1,0,s1);

return l1;
    }

    public static void check(String s[],List<String> l1,int i,StringBuilder s1){
     
     if(i==s.length){
    String s2=new String(s1.toString());
    l1.add(s2);
    return;
     }

      for(int j=0;j<s[i].length();j++){
       s1.append(s[i].charAt(j));
       check(s,l1,i+1,s1);
       s1.deleteCharAt(s1.length()-1);
      }

    }
}