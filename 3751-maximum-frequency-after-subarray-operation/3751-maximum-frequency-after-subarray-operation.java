class Solution {
    public int maxFrequency(int[] nums, int k) {

        
   
        

            int pref[]=new int[nums.length];
        int suf[]=new int[nums.length];
        HashMap<Integer,Integer>h1=new HashMap<>();
        
        int count=0;
        int count2=0;
        int j=nums.length-1;
        
        for(int i=0;i<nums.length;i++){
   h1.put(nums[i],h1.getOrDefault(nums[i],0)+1);
            pref[i]=count;
            if(nums[i]==k){
                count++;
            }
            suf[j]=count2;
            if(nums[j]==k){
                count2++;
            }
            j--;
        }
        
    int ans=pref[nums.length-1];
        if(nums[nums.length-1]==k){
            ans++;
        }
        
int tot=ans;
    for(Map.Entry<Integer,Integer> m1:h1.entrySet()){

        int key=m1.getKey();
     if(key!=k){

          int val=0;
            int cur=0;
            int i=0;
             j=0;
             int v=0;
            while(j<nums.length){

                 if(nums[j]==k){
                   
                    cur--;
                 }
               if(nums[j]==key){
                    cur++;
                    v++;
                }
                
                val=Math.max(val,pref[i]+v+suf[j]);
                if(cur<=0){
                    cur=0;
                    i=j+1;
                    j=i;
                    v=0;
                }
                else{
                    j++;
                }
                    
            }
     
            ans=Math.max(val,ans);
     }
            
            
            
            
        
    }

        return ans;
        
        }
        
    }
