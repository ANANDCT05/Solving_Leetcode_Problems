class Solution {
    Solution t[];
    int count;
    Solution(){
        t=new Solution[26];
        count=1;
    }
    public int[] sumPrefixScores(String[] words) {
Solution s1=new Solution();
int n[]=new int[words.length];
     for(int i=0;i<words.length;i++){
        insert(words[i],s1);
     }

     int c=0;
     for(int i=0;i<n.length;i++){

        n[i]=check(words[i],s1);
     }

     return n;

    }

    public static void insert(String s,Solution s1){

        for(int i=0;i<s.length();i++){

            int v=s.charAt(i)-'a';
            if(s1.t[v]==null){
                Solution s3=new Solution();
                s1.t[v]=s3;
                s1=s3;
            }
            else{
                s1=s1.t[v];
                s1.count+=1;
            }
        }
    }

    public static int check(String s,Solution s1){
int v=0;
        for(int i=0;i<s.length();i++){
            int in=s.charAt(i)-'a';
           
                s1=s1.t[in];
                v=v+s1.count;
            }
            return v;
        }

      
    }
