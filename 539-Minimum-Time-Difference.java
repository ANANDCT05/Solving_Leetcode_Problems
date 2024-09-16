class Solution {
    public int findMinDifference(List<String> tp) {
        int r=0;

        Collections.sort(tp);

        int ans=Integer.MAX_VALUE;
        for(int i=0;i<tp.size()-1;i++){
              String arr1[]=tp.get(i).split(":");
                int h1=Integer.parseInt(arr1[0]);
                int m1=Integer.parseInt(arr1[1]);
          
                
                String arr2[]=tp.get((i+1)%tp.size()).split(":");
               
                int h2=Integer.parseInt(arr2[0]);
                int m2=Integer.parseInt(arr2[1]);


            
             if(h1<h2){
                int le=(h2-h1-1)*60 +(m2+(60-m1));
                int re=( 24-(h2+1) +h1)*60+(60-m2+m1);
                

                 ans=Math.min( ans,Math.min(le,re));
             }

           

             else{
                int le=Math.abs(m1-m2);
                ans=Math.min(ans,le);
             }
              
            }
            
String arr1[]=tp.get(tp.size()-1).split(":");
                int h1=Integer.parseInt(arr1[0]);
                int m1=Integer.parseInt(arr1[1]);
          
                
                String arr2[]=tp.get(0).split(":");
               
                int h2=Integer.parseInt(arr2[0]);
                int m2=Integer.parseInt(arr2[1]);
            
  int le=(h1-h2-1)*60+(m1+(60-m2));
               int re=((24-(h1+1)) +h2)*60 +((60-m1+m2));
               ans=Math.min( ans,Math.min(le,re));
       
        

        return ans;

    }
}