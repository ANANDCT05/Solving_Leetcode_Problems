class Solution {
    public int findComplement(int num) {
        
        String s =Integer.toBinaryString(num);
StringBuilder s1=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0'){
                s1.append('1');
            }
            else{
                s1.append('0');
            }
        }
   int a=   Integer.parseInt(s1.toString(),2);  

   return a;
    }
}