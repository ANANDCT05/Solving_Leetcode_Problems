class Solution {
    public int numberOfSubstrings(String s) {
      HashMap<Character,Integer>h1=new HashMap<>();
         int count=0;
         int l=0;
         int r=0;


         while(r<s.length()){

            h1.put(s.charAt(r),h1.getOrDefault(s.charAt(r),0)+1);



                while(h1.size()==3){

                    count =count+s.length()-(r);
                    h1.put(s.charAt(l),h1.get(s.charAt(l))-1);
                    if(h1.get(s.charAt(l))==0){
                      h1.remove(s.charAt(l));  
                    }
                    l++;
                }
            
            r++;

         }
         return count;
    }
    }
