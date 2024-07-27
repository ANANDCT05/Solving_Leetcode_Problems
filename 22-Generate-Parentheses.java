class Solution {
    public List<String> generateParenthesis(int n) {
        

        List<String> l1=new ArrayList<>();
        int o=0;
        int e=0;

        StringBuilder b1=new StringBuilder();
        generate(b1,0,0,l1,n*2,n);
        return l1;

    }


    public static void generate(StringBuilder b1,int o,int e,List<String> l1,int n1,int n){

      if(b1.length()==n1){
     

     String s1=b1.toString();

        l1.add(s1);

        return;

      }
     
     if(o<n && e<n){
      o++;
      b1.append('(');
      generate(b1,o,e,l1,n1,n);

      b1.deleteCharAt(b1.length()-1);
      o--;
     }

     if(e<n && o>e){
        e++;
        b1.append(')');
        generate(b1,o,e,l1,n1,n);
        b1.deleteCharAt(b1.length()-1);
        e--;
        
     }

    
       
       }


    }
