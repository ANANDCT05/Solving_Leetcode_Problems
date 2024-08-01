class Solution {
   public boolean minlens(int n1,int n2){
    if(n1>n2){
        return true;
    }
    return false;
   }
    public String minWindow(String s, String t) {
      if(t.length()>s.length()){
        System.out.println("hi");
        return "";

      }
        int l=0;
        int r=0;
        int min=100000;
       int count=0;
         int hash[]=new int [256];
         int st=0;

         for(int i=0;i<t.length();i++){
            hash[t.charAt(i)]++;
         }
    while(r<s.length()){
        if(hash[s.charAt(r)]>0){
                count=count+1;

             }
                 hash[s.charAt(r)]--;
        while(count==t.length()){
        if(minlens(min,r-l+1)){
         min=r-l+1;
         st=l;        
         }
         if(hash[s.charAt(l)]==0){
         count--;
         }
         hash[s.charAt(l)]++;
        l=l+1;
        }
        r=r+1;
    }
    if(min==100000){
        return "";
    }
    String s1=new String(s.substring(st,st+min));
    return s1;


     
}
}