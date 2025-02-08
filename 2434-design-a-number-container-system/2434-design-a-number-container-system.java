class NumberContainers {
     HashMap<Integer,Integer>h1;
     HashMap<Integer,TreeSet<Integer>>h2;
    public NumberContainers() {
        h1=new HashMap<>();
        h2=new HashMap<>();
    }
    
    public void change(int index, int number) {
        
        if(h1.get(index)!=null){
           int val=h1.get(index);
            h2.get(val).remove(index);
        }
       
           
           h1.put(index,number);
        TreeSet<Integer>v=h2.getOrDefault(number,new TreeSet<>());
         v.add(index);
         h2.put(number,v);

        
    }

    
    public int find(int number) {
        
        if(h2.get(number)!=null && h2.get(number).size()>0){
            return h2.get(number).first();
        }

        return -1;
    }
}

/**
 * Your NumberContainers object will be instantiated and called as such:
 * NumberContainers obj = new NumberContainers();
 * obj.change(index,number);
 * int param_2 = obj.find(number);
 */