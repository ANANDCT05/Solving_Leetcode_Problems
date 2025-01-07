class Solution {
    public boolean exist(char[][] board, String word) {
        

        

          int dp[][]=new int[board.length][board[0].length];
    
          for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){

            
               if( board[i][j] == word.charAt(0) && check(board,word,i,j,0,dp)){
                return true;
               }
          }

          }

          return false;
        }
    


    public static boolean check(char [][] board,String w,int i,int j,int l,int dp[][]){
     if(l==w.length()){
        return true;
     }

     if(i<0 || i>=board.length){
        return false;
     }

     if(j<0 || j>=board[0].length){
        return false;
     }
     if(dp[i][j]!=0){
    return false;
   }

    
    if(board[i][j]==w.charAt(l)){
    l=l+1;
 }
 else{
    return false;
 }
    
  dp[i][j]=1;
        if(check(board,w,i,j-1,l,dp)){
            return true;
        
  }
        if(check(board,w,i,j+1,l,dp)){
            return true;
        }
        if(check(board,w,i-1,j,l,dp)){

            return true;
        }
        if(check(board,w,i+1,j,l,dp)){
            return true;
        }
        
   dp[i][j]=0;
    return false;

     
    }
}