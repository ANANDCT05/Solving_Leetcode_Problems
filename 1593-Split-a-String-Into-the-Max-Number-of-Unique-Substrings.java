class Solution {
    int c=0;
    public int maxUniqueSplit(String s) {
        
        String s1=new String();
        HashMap<String,Integer> h1=new HashMap<>();

        check(0,s1,s,0,h1);
        return c;


    }


    public  void  check(int i,String s1,String s,int a,HashMap<String,Integer> h1 ){

        if(i==s.length()){
   

     if(h1.get(s1)==null){
        
        c=Math.max(c,a);

   }
   return;
        }


        s1+=s.charAt(i);

 
        if(h1.get(s1)==null){
            h1.put(s1,1);
            check(i+1,new String(),s,a+1,h1);
            h1.remove(s1);
        }

                   
            check(i+1,s1,s,a,h1);
       
    }
}