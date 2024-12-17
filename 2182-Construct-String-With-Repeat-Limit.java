class Solution {
    public String repeatLimitedString(String s, int r) {
        


        int ht[]=new int[26];

        for(int i=0;i<s.length();i++){

            ht[s.charAt(i)-97]++;
        
        }

        StringBuilder s2=new StringBuilder();

        int l=25;

        while(l>=0){

            while(ht[l]>0){
int min=Math.min(r,ht[l]);

for(int i=0;i<min;i++){
    s2.append(   (char)('a'+l));
}
if(min==r && (ht[l]-min)>0){

    
    int in=get(ht,l);

    if(in<0){
        return s2.toString();
    }

    s2.append(   (char)('a'+in));
   
    ht[in]--;
}

ht[l]=ht[l]-min;

}

l--;
            

            }
    

    return s2.toString();
    }




    public int get(int ht[],int c){
c=c-1;

        while(c>=0){

            if(ht[c]>0){
                return c;
            }
            c--;
        }

        return -1;
    }
}