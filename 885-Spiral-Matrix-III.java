class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        
        
        int ans[][]=new int [rows*cols][2];
    
        
       
        ans[0]=new int[]{rStart,cStart};
        helper(ans,rStart,cStart+1,1,0,1,1,1,1,1,rows,cols);
        return ans;
    }



    public static void helper(int[][] ans,int i,int j,int ho,int ve,int h,int w,int l,int t,int in,int r,int c){

        if(in==ans.length){
            return ;
        }
        if(ho==1){

            int to=1;
            int k=i; 
            int m=j;
            while(to<=h){
             
             if((k>=0 && k<r) && (m>=0 && m<c) ){
                ans[in++]=new int[]{k,m};
                
             }
             m=m+l;
             to++;

            }

           

            helper(ans,i+t,m-l,0,1,h+1,w,-l,t,in,r,c);
        }


        else if(ve==1){
           
            int to=1;
            int k=i;
            int m=j;

            while(to<=w){

                if((m>=0 && m<c) && (k>=0 && k<r) ){
                    ans[in++]=new int[]{k,m};
                   
                   
                
                }
                k=k+t;
                to++;
            }

             helper(ans,k-t,j+l,1,0,h,w+1,l,-t,in,r,c);
        }


    }
}