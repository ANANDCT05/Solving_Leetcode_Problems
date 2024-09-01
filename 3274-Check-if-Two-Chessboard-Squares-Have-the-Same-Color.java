class Solution {
    public boolean checkTwoChessboards(String s, String s1) {

int f=0;

for(int i=0;i<2;i++){
    int n=s.charAt(i)-s1.charAt(i);
    if(n%2!=0){
    f++;
    }
}

if(f%2!=0){
    return false;
}
return  true;


      


    }
}