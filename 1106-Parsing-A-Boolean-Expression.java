class Solution {
    public boolean parseBoolExpr(String e) {
        

        Stack<Character> s1=new Stack<>();
        Stack<Character> s2=new Stack<>();

        for(int i=0;i<e.length();i++){
            if(e.charAt(i)=='f' || e.charAt(i)=='t'){

                s1.push(e.charAt(i));
            }

            else if(e.charAt(i)=='|' || e.charAt(i)=='&' || e.charAt(i)=='!'){
                s2.push(e.charAt(i));
            }
            else if(e.charAt(i)=='('){

                s1.push('(');
            }

            else if(e.charAt(i)==')'){
                
                if(!s2.isEmpty()){

                    char c=s2.pop();

                    if(c=='|'){

                      if(s1.size()==1){
                        break;
                      } 
                      int f=0;

                      while(s1.size()>0 ){
                        char a=s1.pop();

                        if(a=='t'){
                            f=1;
                            
                        }

                        if(a=='('){
                         break;
                        }
             
                        
                      }
                if(f==1){
                           
                            s1.push('t');
                        }
                        else{
                            s1.push('f');
                        }

                    }

                    else if(c=='&'){
                   if(s1.size()==1){
                        break;
                      } 
                      int f=0;

                      while(s1.size()>0){
                        char a=s1.pop();

                        if(a=='f'){
                            f=1;
                        
                        }
                   if(a=='('){
                     break;
                        }
                        
                      }
                  if(f==1){
                           
                            s1.push('f');
                        }
                        else{
                            s1.push('t');
                        }
                    }

                    else{
                  
                     char a=s1.pop();
                      s1.pop();
                     if(a=='t'){
                        s1.push('f');
                       
                     }
                     else{
                        s1.push('t');
                     }
                    }
                }
            }
        }

System.out.println(s1);
        if(s1.peek()=='t'){
            return true;
        }

        else{
            return false;
        }
    }
}