class Solution {
    public boolean isIsomorphic(String s, String t) {
    

    if(s.length()!=t.length()){
        return false;
    }

    HashMap<Character,Character>h1=new HashMap<>();
    List<Character>h2=new ArrayList<>();
    for(int i=0;i<s.length();i++){

        if(!h1.containsKey(s.charAt(i))){

       if(h2.contains(t.charAt(i))){
             return false;
       }

       h1.put(s.charAt(i),t.charAt(i));
       h2.add(t.charAt(i));
        }

        else{
            if(h1.get(s.charAt(i)) !=t.charAt(i)){
                return false;
            }
        }

        
    }
    return true;
    }
}