class Solution {
    public String shiftingLetters(String s, int[][] shifts) {
        int arr[]=new int[s.length()+1];
        int e=0;
for(int i=0;i<shifts.length;i++){
   if(shifts[i][2]==0){
    e=-1;
   }
   else{
    e=1;
   }
    arr[shifts[i][0]]+=e;
    arr[shifts[i][1]+1]-=e;

}
StringBuilder s1=new StringBuilder();

int c=0;
for(int i=0;i<s.length();i++){
c=c+arr[i];
    if(c<0){
        int f= (s.charAt(i)+(c));
        if(f<97){
            int d=(97-f-1)%26;
           
            s1.append((char) ('z'-d));
        }
        else{
            s1.append((char)(s.charAt(i)+c));
        }
    }
    else{
        int m=(s.charAt(i)+(c));
        if(m>122){
            int d=(m-122-1)%(26);
            
            s1.append((char)('a'+d));
        }
        else{
            s1.append((char)(s.charAt(i)+c));
        }
    }

}

return s1.toString();

    }
}