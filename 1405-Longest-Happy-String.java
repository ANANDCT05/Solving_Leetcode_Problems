class Solution {
    public String longestDiverseString(int a, int b, int c) {
        
       Comparator <Pair<Integer,Character>> c1=new Comparator<>(){

        public int compare(Pair<Integer,Character> p1,Pair<Integer,Character> p2){

            if(p1.getKey()<p2.getKey()){
                return 1;
            }
            return -1;
        }
       };

       StringBuilder s1=new StringBuilder();
       Pair<Integer,Character> p2= new Pair<>(a,'a');
       Pair<Integer,Character> p3=new Pair<>(b,'b');
       Pair<Integer,Character> p4=new Pair<>(c,'c');
       PriorityQueue<Pair<Integer,Character>> pq=new PriorityQueue<>(c1);
     if(p2.getKey()!=0){
       pq.add(p2);
     }
     if(p3.getKey()!=0){
       pq.add(p3);
     }
     if(p4.getKey()!=0){
       pq.add(p4);
     }

     while(!pq.isEmpty()){
Pair<Integer,Character>p5=pq.poll();
        if(s1.length()!=0){
 char ch=s1.charAt(s1.length()-1);
            if(p5.getValue()!=ch){

            int co=p5.getKey();

            if(co>1){
                s1.append(p5.getValue());
                s1.append(p5.getValue());
                co=co-2;
                p5=new Pair(co,p5.getValue());
                if(co!=0){
                pq.add(p5);
                }
            }

            else{
                s1.append(p5.getValue());

            }
            }
        
            else{

             if(pq.isEmpty()){
                    break;
                } 

                Pair<Integer,Character> p6=pq.poll();
                if(p5.getKey()>p6.getKey()){

                   
                        
                            s1.append(p6.getValue());
                         
                            int u=p6.getKey();
                            u=u-1;
                            if(u!=0){
                                p6=new Pair(u,p6.getValue());
                                pq.add(p6);
                            }

                        s1.append(p5.getValue());
                        s1.append(p5.getValue());
                        int u1=p5.getKey();
                        u1=u1-2;

                        if(u1!=0){
                          p5=new Pair(u1,p5.getValue());
                          pq.add(p5);
                        }
                    
                }

                    else{


                            s1.append(p6.getValue());
                            int u1=p6.getKey();
                            u1=u1-1;

                            if(u1!=0){
                                p6=new Pair(u1,p6.getValue());
                                pq.add(p6);
                            }
                     if(p5.getKey()==1){
                       s1.append(p5.getValue());
                     }
                   else{
                        int u11=p5.getKey();
                        u11=u11-2;
s1.append(p5.getValue());
                        s1.append(p5.getValue());
                        if(u11!=0){
                          p5=new Pair(u11,p5.getValue());
                          pq.add(p5);
                        }

                   }

                        
                        
                    }
                

                } 
     }
                

        else{
          
        int co=p5.getKey();
        char k=p5.getValue();
        if(co==1){
            s1.append(k);
        }
        else{
            co=co-2;
            s1.append(k);
            s1.append(k);

            if(co!=0){
                p5=new Pair(co,k);
                pq.add(p5);
            
            }
        }


        }
    }

    return s1.toString();
      
     

    }
}