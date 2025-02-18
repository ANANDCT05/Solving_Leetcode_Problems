class Solution {
      public static StringBuilder s=new StringBuilder();
    public String smallestNumber(String pattern) {
   
      s=new StringBuilder();
      boolean vis[]=new boolean[10];
      check(10,vis,'D',pattern,s,0); 
      return s.toString();
    }

    public static boolean check(int pr,boolean v[],char ch,String pattern,StringBuilder s,int i){

        if(i==(pattern.length()+1)){
            return true;
        }
  char now='a';
  if(i==pattern.length()){
    now='D';
  }
  else{
    now=pattern.charAt(i);
  }

        for(int j=1;j<=9;j++){

            if(v[j]){
                continue;
            }
            if(ch=='I' && pr>j){
                continue;
            }
            if(ch=='D' && pr<j){
                continue;
            }
            v[j]=true;
            s.append( Integer.toString(j).charAt(0));
         boolean ans=   check(j,v,now,pattern,s,i+1);
         if(ans==true){
            return true;
         }
         v[j]=false;
         s.deleteCharAt(s.length()-1);
        }
        return false;
    }

}