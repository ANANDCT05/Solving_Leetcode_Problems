class Solution {
    public long subArrayRanges(int[] nums) {
        int ps[]=new int[nums.length];
        int pg[]=new int [nums.length];
        int ng[]=new int[nums.length];
        int ns[]=new int[nums.length];
        ps1(ps,nums);
        pg1(pg,nums);
        nextg(ng,nums);
        nextS(ns,nums);
        long l=0;
        long s=0;
        for(int i=0;i<nums.length;i++){

            long left=i-pg[i];
            long right=ng[i]-i;
          l=l+ nums[i]*left*right ;
          left=i-ps[i];
          right=ns[i]-i;
          s=s+nums[i]*left*right ;
        }

        return  l-s;
    }



    public static void ps1(int ps[],int nums[]){
      
      int st[]=new int [nums.length];

      int t=-1;

      for(int i=0;i<nums.length;i++){

      while(t>=0 && nums[st[t]]>=nums[i]){
        t--;
      }

      if(t==-1){
        ps[i]=-1;
        
      }

      else{
        ps[i]=st[t];
      }
      st[++t]=i;
      }

     
    }

    public static void pg1(int pg[],int nums[]){
        int st[]=new int [nums.length];

        int t=-1;
        for(int i=0;i<nums.length;i++ ){

            while(t>=0 && nums[st[t]]<= nums[i]){
                t--;
            }

            if(t==-1){
                pg[i]=-1;
            }
            else{
                pg[i]=st[t];
            }
            st[++t]=i;
        }
    }



    public static void nextg(int ng[],int nums[]){
        int st[]=new int[nums.length];

int t=-1;
        for(int i=nums.length-1;i>=0;i--){
    

    while(t>=0 && nums[st[t]]<nums[i]){
        t--;
    }

    if(t==-1){
        ng[i]=nums.length;
    }

    else{
        ng[i]=st[t];
    }
    st[++t]=i;

        }
    }

 public static void nextS(int ps[],int nums[]){
      
      int st[]=new int [nums.length];

      int t=-1;

      for(int i=nums.length-1;i>=0;i--){

      while(t>=0 && nums[st[t]]>nums[i]){
        t--;
      }

      if(t==-1){
        ps[i]=nums.length;
        
      }

      else{
        ps[i]=st[t];
      }
      st[++t]=i;
      }

     
    }



        
}