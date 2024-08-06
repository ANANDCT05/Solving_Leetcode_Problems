class Solution {
    public String removeKdigits(String num, int k) {
        

        int ns[]=new int [num.length()];

        nsmall(num,ns);
        if(k==0){
              return num;
        }
        if(k==num.length()){
            return "0";
        }

        if(k>num.length()){
            return "0";
        }
StringBuilder st=new StringBuilder();

 for(int i=0;i<num.length();i++){

    if(ns[i]!=num.length() || (ns[i]==num.length() && num.charAt(i)!='0')){

        int s=ns[i]-i;         
        if(s<=k){
          k--;
        }
        else{
        st.append(num.charAt(i));
        }
    }

 

             else{

                if(num.charAt(i)=='0' && st.length()==0){
                    continue;
                }
                st.append(num.charAt(i));
                
                
             }


 }
 
if(st.length()==0){
    return "0";
}
 return  st.toString();
    }


    public static void nsmall(String num,int ns[]){
             
             int st[]=new int[ns.length];
int t=-1;
             for(int i=num.length()-1;i>=0;i--){
                
while(t>=0 &&  Character.getNumericValue(num.charAt(i)) <= Character.getNumericValue(num.charAt(st[t]))){
    t--;
}

if(t==-1){
  ns[i]=num.length();
}
else{
    ns[i]=st[t];
}

st[++t]=i;
            
            
 }


 
    }
    }
