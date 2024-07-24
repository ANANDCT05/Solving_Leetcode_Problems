class Solution {

   
    public int myAtoi(String s) {
        
   
        StringBuilder s1 =new StringBuilder();
        int k=0;
        while( k<s.length() && s.charAt(k) ==' '){
            k++;
            
        }
        
       
        if(k<s.length() && (s.charAt(k)=='-' || s.charAt(k)=='+')){

            s1.append(s.charAt(k));
           
            k++;
        }
        
int flag=0;
      
        while(k<s.length() && Character.isDigit(s.charAt(k))){
            s1.append(s.charAt(k));
           flag=1;

            k++;
        }
if(flag==0){
    s1.append(\0\);
}


if(s1.length()==0){
    return 0;
}


try{


    int m=Integer.valueOf(s1.toString());

    return m;
}

catch(NumberFormatException e){

    if(s1.charAt(0)=='-'){
        return Integer.MIN_VALUE;
    }

    return Integer.MAX_VALUE;
}
 
        
    }



   
}