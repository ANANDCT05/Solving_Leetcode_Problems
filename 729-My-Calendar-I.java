class MyCalendar {
    
    TreeMap<Integer,Integer> h1;
    List<Integer> ts;
       List<Integer> te;
    public MyCalendar() {
       
        ts=new ArrayList<>();

        te=new ArrayList<>();
    
    }
    
    public boolean book(int start, int end) {
         int flag=check(start);

         if(flag==-30){
            return false;
         }

       int flag2 = ends(start);

       if(flag2==-30 || flag2!=flag){
        return false;
       }
       int flag3=check(end-1);

       if(flag3==-30 || flag3!=flag){
        return false;
       }
        
         
         ts.add(flag,start);
         te.add(flag,end-1);
         return true;
    } 


   public int  check(int s){
       
        int l=0;
        int h=ts.size()-1;

        while(l<=h){

            int m=(l+h)/2;
            if(ts.get(m)==s){
                return -30;
            }
            else if(ts.get(m)>s){
                h=m-1;

            }
            else{
                l=m+1;
            }
        }

        return l;
   }

   public int  ends(int s){

 int l=0;
        int h=te.size()-1;

        while(l<=h){

            int m=(l+h)/2;
            if(te.get(m)==s){
                return -30;
            }
            else if(te.get(m)>s){
                h=m-1;

            }
            else{
                l=m+1;
            }
        }

        return l;
   }

   


    

}   


/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */