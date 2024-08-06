class Solution {
    public int largestRectangleArea(int[] heights) {
        int ns[]=new int[heights.length];
        int ps[]=new int[heights.length];
  ns1(ns,heights);
ps1(ps,heights);

int sum=0;

int max=0;
       for(int i=0;i<heights.length;i++){
       int l=i-ps[i];
       int r=ns[i]-i;

       

       sum=heights[i] *(l+r-1);
       if(sum>max){
        max=sum;
       }
       }
       return max;
    }

 public static void ns1(int ns[],int[] heights){
 
 int st[]=new int[heights.length];
int t=-1;
 for(int i=heights.length-1;i>=0;i--){

    while(t>=0 && heights[i]<= heights[st[t]]){
        t--;
    }

    if(t==-1){
        ns[i]=heights.length;

    }
    else{
        ns[i]=st[t];
    }

    st[++t]=i;
 }}

 public static void ps1(int ns[],int[] heights){
 
 int st[]=new int[heights.length];
int t=-1;
 for(int i=0;i<heights.length;i++){

    while(t>=0 && heights[i]<= heights[st[t]]){
        t--;
    }

    if(t==-1){
        ns[i]=-1;

    }
    else{
        ns[i]=st[t];
    }

    st[++t]=i;
 }


 
 }
}