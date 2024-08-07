class Solution {
    public String numberToWords(int num) {
        if(num==0){
            return "Zero";
        }
        String a=Integer.toString(num);
      
        String[] s1={"","One ","Two ","Three ","Four ","Five ","Six ","Seven ","Eight ","Nine "};
        String[] s2={"","Ten ","Twenty ","Thirty ","Forty ","Fifty ","Sixty ","Seventy ","Eighty ","Ninety "};
        String []s12={"Ten ","Eleven ","Twelve ","Thirteen ","Fourteen ","Fifteen ","Sixteen ","Seventeen ","Eighteen ","Nineteen " };
        String []end={"","Thousand ","Million ","Billion "};
        String s3="Hundred ";
       
       
int k=(a.length()-1)/3;
        StringBuilder ans=new StringBuilder();
int i=0;

        while(i<a.length()){
            int n=a.length()-i;
            int fin=ans.length();
            int r=n%3;
            if(r==0){
                r=3;
            }
            
            

            while(r>0){
     if(r==3){
        String s9=s1[Character.getNumericValue(a.charAt(i))];
        if(s9.length()!=0){
            s9+=s3;
        }
        ans.append(s9);
        r--;
        i++;
     }


     else if(r==2){
        if(a.charAt(i)=='1'){
           String s9=s12[Character.getNumericValue(a.charAt(i+1))];
           ans.append(s9);

        }

        else{
            String s9=s2[Character.getNumericValue(a.charAt(i))] +s1[Character.getNumericValue(a.charAt(i+1))];
            ans.append(s9);

        }
        i=i+2;
        r=r-2;
     }
        else if(r==1){
String s9=s1[Character.getNumericValue(a.charAt(i))];
ans.append(s9);
r--;
i++;
        }
     
            
            }
            if(k>=0 && fin!=ans.length()){

            ans.append(end[k]);
            }
            k--;
        }
  
        return ans.toString().trim();
    }
        
    
}