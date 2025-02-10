class Solution {
    public String clearDigits(String s) {
Stack<Character> s1=new Stack<>();
        for(int i=0;i<s.length();i++){
       if(s.charAt(i)>='a'){
      s1.push(s.charAt(i));
       }
       else{
        if(!s1.isEmpty()){
            s1.pop();
        }
       
       }
        }

        StringBuilder s2=new StringBuilder();
    while(!s1.isEmpty()){
            s2.append(s1.pop());
        }
        return s2.reverse().toString();

    }
}