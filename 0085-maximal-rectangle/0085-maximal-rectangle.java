class Solution {
    public int maximalRectangle(char[][] m) {
        int nsr[][]=new int [m.length][m[0].length];
        int nsc[][]=new int [m.length][m[0].length];

        rows(m,nsr);
        columns(m,nsc);
int max=0;
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[0].length;j++){
                if(m[i][j]=='0'){
                    continue;
                }
                else{
                    int r=nsr[i][j]-j;
          
          int t=1;
          int a=0;
          int k=j;
          int min=m.length;
                 while(t<=r){
                  
                     int c=nsc[i][k]-i;
                   if(c<min){
                    min=c;
                   }
                     a=t*min;

                     if(a>max){
                        max=a;
                     }
                     k++;
                     t++;
                 }
                 
                   
                }
            }
        }
        return max;
    }
    public static void rows(char[][]m,int [][]nsr){

        for(int i=0;i<m.length;i++){
            int st[]=new int[m[0].length];
           int t=-1;
            for(int j=m[0].length-1;j>=0 ;j--){
            while(t>=0 && m[i][j]-'0'<=m[i][st[t]]-'0'){
                t--;
            }
            if(t==-1){
                nsr[i][j]=m[0].length;
            }
            else{
                nsr[i][j]=st[t]; 
                 }
                 st[++t]=j; 
                }

                } 

                 
    }

     public static void columns(char[][]m,int [][]nsr){

        for(int i=0;i<m[0].length;i++){
            int st[]=new int[m.length];
           int t=-1;
            for(int j=m.length-1;j>=0 ;j--){
            while(t>=0 && m[j][i]-'0'<=m[st[t]][i]-'0'){
                t--;
            }
            if(t==-1){
                nsr[j][i]=m.length;
            }
            else{
                nsr[j][i]=st[t]; 
                 }
                 st[++t]=j; 
                }

                } 


                
                
        }
}
