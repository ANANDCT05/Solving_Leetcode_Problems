class Solution {
    int s=-1;
    int e=-1;
    Solution(){

    }

    public int countPalindromicSubsequence(String s) {
        
  
    int arr[][]=new int[s.length()][26];
    int f[]=new int[26];
    Solution e[]=new Solution[26];
    for(int i=0;i<s.length();i++){
   
   
        int in=s.charAt(i)-'a';
        f[in]++;

        if(f[in]>=1){
        if(e[in]!=null){
            e[in].e=i;
        }

        else{
            Solution n=new Solution();
            n.s=i;
            e[in]=n;
        }
        }
        int c[]=Arrays.copyOf(f,f.length);
        arr[i]=c;
    } 

    


    int tot=0;
    
  for(int i=0;i<26;i++){
    Solution c=e[i];

    if(c!=null){

        if(c.e!=-1){
            int cou=0;
            int m[]=arr[c.e-1];
            int l[]=arr[c.s];
          for(int k=0;k<26;k++){
       int  d=m[k]-l[k];
      

         if(d>0){
            cou=cou+1;
         }
          
          }

          tot=tot+cou;
        
        }
    }
  }

  return tot;



    }
}