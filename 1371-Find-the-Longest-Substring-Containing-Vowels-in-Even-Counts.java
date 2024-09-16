class Solution {
    public int findTheLongestSubstring(String s) {
       

       int x=0;
       int arr[]=new int[100];
       Arrays.fill(arr,-2);
       arr[0]=-1;
       int max=0;
       int res=0;

       for(int i=0;i<s.length();i++){
        
        char c=s.charAt(i);
        if(c=='a' || c=='e'|| c=='i'|| c=='o' || c=='u'){
            x=x^(c-'a'+1);
          
            if(arr[x]==-2){
              arr[x]=i;
            }
           

        }

        
       
         res=i-arr[x];
max=Math.max(res,max);
       }
       return max;
        }

  
    
}