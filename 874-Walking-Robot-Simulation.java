class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {
        int n=1;
        int s=0;
        int e=0;
        int w=0;
        int x=0;
        int y=0;
        int d=0;

       HashMap<Integer,List<Integer>> h1=new HashMap<>();

        for(int i=0;i<obstacles.length;i++){
            
                if(h1.containsKey(obstacles[i][0])){
                    h1.get(obstacles[i][0]).add(obstacles[i][1]);

                }
                else{
                    List<Integer> l1=new ArrayList<>();
                   l1.add(obstacles[i][1]);
                    h1.put(obstacles[i][0],l1);
                }
            }
        

        for(int i=0;i<commands.length;i++){

            if(commands[i]>0){
             
             if(n==1 ){
              
              for(int l=1;l<=commands[i];l++){
           y=y+1;
         if(h1.containsKey(x)){
        List<Integer> l1=h1.get(x);
        if(l1.contains(y)){
            y=y-1;
            break;
        }
      }
              }

             }
             else if(s==1){
              for(int l=1;l<=commands[i];l++){
           y=y-1;
         if(h1.containsKey(x)){
        List<Integer> l1=h1.get(x);
        if(l1.contains(y)){
            y=y+1;
            break;
        }
             }
              }
             }

             else if(e==1){
               for(int l=1;l<=commands[i];l++){

                x=x+1;
                if(h1.containsKey(x)){
                    List<Integer> l1=h1.get(x);
                    if(l1.contains(y)){
                        x=x-1;

                        break;
                    }

                }

               
               }
             }

             else{
                for(int l=1;l<=commands[i];l++){

                x=x-1;
                if(h1.containsKey(x)){
                    List<Integer> l1=h1.get(x);
                    if(l1.contains(y)){
                        x=x+1;

                        break;
                    }

                }
             }
             }
            }

            

            else{
                if(commands[i]==-1){

                    if(n==1){
                        n=0;
                        e=1;
                    }

                    else if(s==1){
                        s=0;
                        w=1;
                    }
                    else if(e==1){
                        e=0;
                        s=1;
                    }
                    else{
                        w=0;
                        n=1;
                    }
                }

                else{

                      if(n==1){
                        n=0;
                        w=1;
                    }

                    else if(s==1){
                        s=0;
                        e=1;
                    }
                    else if(e==1){
                        e=0;
                        n=1;
                    }
                    else{
                        w=0;
                        s=1;
                    }

                }

               
            }
          
        
  d=Math.max(d,(x*x)+(y*y));
             }

        return d;
    }


    
}