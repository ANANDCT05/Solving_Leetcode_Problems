class Solution {
    int start=-1;
    int end=-1;
    Solution(){

    }

    public int countPalindromicSubsequence(String s) {
        
  
    int arr[][]=new int[s.length()][26];
    int freq[]=new int[26];
    Solution pairs[]=new Solution[26];
    for(int i=0;i<s.length();i++){
   
   
        int in=s.charAt(i)-'a';
        freq[in]++;

        
        if(pairs[in]!=null){
            pairs[in].end=i;
        }

        else{
            Solution n=new Solution();
            n.start=i;
            pairs[in]=n;
        }
        
        int currprefix[]=Arrays.copyOf(freq,freq.length);
        arr[i]=currprefix;
    }

    


    int tot=0;
    
  for(int i=0;i<26;i++){
    Solution cur=pairs[i];

    if(cur!=null){

        if(cur.end!=-1){
            int count=0;
            int end[]=arr[cur.end-1];
            int start[]=arr[cur.start];
          for(int k=0;k<26;k++){
    
      

         if(end[k]-start[k]>0){
            count=count+1;
         }
          
          }

          tot=tot+count;
        
        }
    }
  }

  return tot;



    }
}