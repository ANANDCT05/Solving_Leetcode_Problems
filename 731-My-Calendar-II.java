class MyCalendarTwo {
TreeMap<Integer,Integer>h1;
    public MyCalendarTwo() {
        h1=new TreeMap<>();
    }
    
    public boolean book(int start, int end) {
       
     h1.put(start,h1.getOrDefault(start,0)+1);
        h1.put(end,h1.getOrDefault(end,0)-1);  
int co=0;
        for(Map.Entry<Integer,Integer>h:h1.entrySet()){
      co+=h.getValue();
     

      if(co>2){
        h1.put(start,h1.get(start)-1);
        h1.put(end,h1.get(end)+1);
        return false;
      }
        }

        return true;
    }
}

/**
 * Your MyCalendarTwo object will be instantiated and called as such:
 * MyCalendarTwo obj = new MyCalendarTwo();
 * boolean param_1 = obj.book(start,end);
 */