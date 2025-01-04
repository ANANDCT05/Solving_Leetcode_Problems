class Solution {
    public boolean find132pattern(int[] nums) {
        

        int prm[]=new int[nums.length];
int ans=Integer.MAX_VALUE;
    
     prm[0]=Integer.MAX_VALUE;
        
        int prg[]=new int[nums.length];

        Stack<Integer> s1=new Stack<>();
        prg[0]=-1;
        s1.push(0);
        for(int i=1;i<nums.length;i++){
ans=Math.min(nums[i-1],ans);
            prm[i]=ans;
            while(!s1.isEmpty() && nums[s1.peek()]<=nums[i]){
                s1.pop();
            }

            if(s1.isEmpty()){
                prg[i]=-1;
              
            }

            else{
             prg[i]=s1.peek();
            }
            s1.push(i);
        }

        for(int i=2;i<nums.length;i++){

            if(prg[i]!=-1){
                
                if(prm[prg[i]]<nums[i] && prm[prg[i]]<nums[prg[i]]){
                    return true;
                }
            }
        }

        return false;
    }
}