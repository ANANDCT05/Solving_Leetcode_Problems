class Solution {
    public int countConsistentStrings(String a, String[] words) {


     HashMap<Character,Integer> h1=new HashMap<>();

     for(int i=0;i<a.length();i++){
        h1.put(a.charAt(i),1);
     }  
     int c=0;
     int flag=0;

     for(int i=0;i<words.length;i++){
flag=0;
for(int j=0;j<words[i].length();j++){
    if(h1.get(words[i].charAt(j))==null){
        flag=1;
        break;
    }
}

if(flag==0){
    c++;
}
     } 
     return c;
    }
}