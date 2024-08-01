class Solution {
    public int evalRPN(String[] tokens) {
        

     String st[]=new String[tokens.length];
     int top=-1;
     int prev=-2;


     for(int i=0;i<tokens.length;i++){

       
        
             if(tokens[i].charAt(0)=='+' && tokens[i].length()==1){
                
                if(prev>=0){
                    int a=Integer.valueOf(st[prev])+Integer.valueOf(st[top]);;
                    st[--top]=Integer.toString(a);
                    prev--;
                }
             }


             
            else if(tokens[i].charAt(0)=='-' && tokens[i].length()==1){
                
                if(prev>=0){
                    int a=Integer.valueOf(st[prev])-Integer.valueOf(st[top]);;
                    st[--top]=Integer.toString(a);
                    prev--;
                }
             }
             
            else if(tokens[i].charAt(0)=='*' && tokens[i].length()==1) {
                
                if(prev>=0){
                    int a=Integer.valueOf(st[prev])*Integer.valueOf(st[top]);;
                    st[--top]=Integer.toString(a);
                    prev--;
                }
             }
             
             else if(tokens[i].charAt(0)=='/' && tokens[i].length()==1){
                
                if(prev>=0){
                    int a=Integer.valueOf(st[prev])/Integer.valueOf(st[top]);
                    st[--top]=Integer.toString(a);
                    prev--;
                    
                }
             }
            else{
                st[++top]=tokens[i];
                prev++;
            }

           
        }
        return Integer.valueOf(st[0]);
     }
    
}