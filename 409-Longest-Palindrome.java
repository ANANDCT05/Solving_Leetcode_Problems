class Solution {
    public int longestPalindrome(String s) {
        
        HashMap<Character,Integer> h1=new HashMap<>();

        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            h1.put(c,h1.getOrDefault(c,0)+1);
        }
        int f=0;
int sum=0;

       for(int n:h1.values()){
        if(n%2==0){
            sum=sum+n;
        }
        else{
            sum=sum+n-1;
     f=1;
        }
       }
        

        return sum+f;
    }
}