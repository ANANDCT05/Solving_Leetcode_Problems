class Solution {
    public void solve(char[][] board) {

        boolean [][]b1=new boolean[board.length][board[0].length] ;
int r[]={-1,0,+1,0};
int c[]={0,+1,0,-1};
int n=board.length-1;
int m=board[0].length-1;
int v[][]=new int [board.length][board[0].length];
        for(int i=0;i<board[0].length;i++){

            if(board[0][i]=='O'){
                dfs(0,i,b1,board,r,c,v);
            }
        }
        for(int i=0;i<board[0].length;i++){

            if(board[n][i]=='O'){
                dfs(n,i,b1,board,r,c,v);
            }
        }
        for(int i=0;i<board.length;i++){

            if(board[i][0]=='O'){
                dfs(i,0,b1,board,r,c,v);
            }
        }

           for(int i=0;i<board.length;i++){

            if(board[i][m]=='O'){
                dfs(i,m,b1,board,r,c,v);
            }
           }

           for(int i=0;i<=n;i++){
            for(int j=0;j<=m;j++){
                if(b1[i][j]==false && board[i][j]=='O'){
                    board[i][j]='X';
                }
            }
           }
           
    }


    public static void dfs(int i,int j,boolean [][]b,char [][]bo,int r[],int c[],int [][]v){

        v[i][j]=1;
        b[i][j]=true;
        for(int k=0;k<4;k++){
            int r1=i+r[k];
            int c1=j+c[k];
    
            if(r1>=0 && r1<bo.length && c1>=0 && c1<bo[0].length && v[r1][c1]==0 && bo[r1][c1]=='O'){
                dfs(r1,c1,b,bo,r,c,v);
            }
        }
    }
}