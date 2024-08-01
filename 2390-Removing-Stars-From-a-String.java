class Solution {
    public String removeStars(String s) {
        

    char st[]=new char[s.length()];
int top=-1;

    for(int i=0;i<s.length();i++){

        if(s.charAt(i)!='*'){
           st[++top]=s.charAt(i);
        }

        else{
            if(top>=0){
                top--;
            }
        }
    }

    return new String(st,0,top+1);
        
    }
}