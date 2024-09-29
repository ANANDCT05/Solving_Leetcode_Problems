class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

 List<Integer>a1=new ArrayList<Integer>();
Set<List<Integer>> a2=new HashSet<>();
HashMap<Integer,Integer> h1=new HashMap<>();


HashMap<Integer,Integer> c1=new HashMap<>();
    if(nums.length<3){
        return new ArrayList<List<Integer>>();
        
    }

for(int i=0;i<nums.length;i++){
    h1.put(nums[i],i);
}

    for(int i=0;i<nums.length-2;i++){
     
     check(nums[i],h1,nums,a1,a2,i);
  
  
        
    }



    

   
List<List<Integer>> a5 = List.copyOf(a2);
    


    return a5;

    }


    public static void check(int s, HashMap<Integer,Integer> h1,int nums[],List<Integer>a1 ,Set<List<Integer>> a2,int j){

        
int sum=s;
         for(int i=j+1;i<nums.length-1;i++){

            sum=s;
            
            sum=sum+nums[i];
            
            

            if(h1.get(-sum)!=null && h1.get(-sum)!=i && h1.get(-sum)!=j ){

                

              
                    a1=new ArrayList<>();
                    a1.add(nums[j]);
                    a1.add(nums[i]);
                    a1.add(-sum);
                   Collections.sort(a1);
                 
                 
                  
                  
                   a2.add(a1);
                   

                  
             
                   

                }


            }

            
            
         }

         
    
    


}