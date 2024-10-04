class Solution {
    public long dividePlayers(int[] skill) {
        
   int n=skill.length/2;
  
     int ht[]=new int [1001];
   int sum=0;
   for(int i=0;i<skill.length;i++){
    sum=sum+skill[i];
    ht[skill[i]]++;
   }

   int t=sum/n;
   if(sum%n!=0){
    return -1;
   }

 
long fin=0;

    for(int i=0;i<skill.length;i++){
       if(ht[skill[i]] >0){
        int e=skill[i];
        int ne= t-e;
        

        if(ht[ne]==0){
            return -1;
        }
        
        ht[ne]--;
        ht[skill[i]]--;
        
    fin=fin+(ne*e);
       }
    }

    return fin;
   
    }
}