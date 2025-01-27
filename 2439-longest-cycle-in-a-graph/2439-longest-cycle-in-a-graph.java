class Solution {
    int max=0;
    public int longestCycle(int[] edges) {
        max=0;
        int  v[]=new int[edges.length];
        for(int i=0;i<edges.length;i++){
            if(v[i]==0){

                check(edges,v,1,i);
            }
        }
        if(max==0){
            return -1;
        }
        return max;
    }

    public void check(int e[],int v[],int val,int i ){
if(i==-1){
    return ;
}
        if(v[i]>0){
            max=Math.max(val-v[i],max);
            return;
        }

        if(v[i]==-1){
            return ;
        }

        v[i]=val;
        check(e,v,val+1,e[i]);
        v[i]=-1;
        return ;
    }
}