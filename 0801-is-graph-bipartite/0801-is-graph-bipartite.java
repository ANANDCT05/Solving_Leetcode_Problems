class Solution {

    
    public boolean isBipartite(int[][] graph) {
        
int v[]=new int[graph.length];
HashMap<Integer,Character> h1=new HashMap<>();
for(int i=0;i<graph.length;i++){

    if(v[i]==0){

        if(dfs(i,'B',h1,v,graph)==false){
            return false;
        }
    }



}

return true;

     
    }


    public boolean dfs(int n,char c,HashMap<Integer,Character> h1,int v[],int g[][]){


        if(v[n]!=0){

            if(h1.get(n)!=c){
                return false;
            }

            return true;
        }

        v[n]=1;
        h1.put(n,c);
char a='a';
if(c=='B'){
    a='Y';
}
else{
    a='B';
}

        for(int i=0;i<g[n].length;i++){

            if(dfs(g[n][i],a,h1,v,g)==false){

                return false;
            }
        }

        return true;
    }
}