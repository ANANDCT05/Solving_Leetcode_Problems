class Solution {
    public String makeFancyString(String s) {
    
StringBuilder s1=new StringBuilder();
int c=1;
s1.append(s.charAt(0));
     for(int i=1;i<s.length();i++){
  if(s.charAt(i-1)==s.charAt(i)){
    c++;
    
  }
 else if(s.charAt(i-1)!=s.charAt(i)){
    c=1;
 }
  if(c<3){
   
    s1.append(s.charAt(i));
  
  }
       
     }
     return s1.toString();
    }
}