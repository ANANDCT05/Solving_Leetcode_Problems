class Solution {
    public boolean areSentencesSimilar(String s1, String s2) {
      

        String arr1[]=s1.split(" ");
        String arr2[]=s2.split(" ");
       
        HashMap<String ,Integer >h1=new HashMap<>();
     if(arr2.length>arr1.length){
  

 
  int d=arr2.length-arr1.length;
 
  int i=0;
  int j=d-1;
 

  while(j<arr2.length){
 int e=-1;
        int l=0;
     int k=0;
 int flag=0;
     while(k!=i){
       if(!arr2[k].equals(arr1[l])){
    
        flag=1;
        break;
       }
      
       k++;
       l++;
     }

     if(flag==0){

        k=j+1;

    
        while(k<arr2.length){
            if(!arr2[k].equals(arr1[l])){
                
        flag=1;
        break;
       }
       

      
       k++;
       l++;
        }
     }

     if(flag==0){
        return true;
     }

     j++;
     i++;
  }
  return false;
     }

     

       if(arr1.length>arr2.length){
  

 
  int d=arr1.length-arr2.length;
 
  int i=0;
  int j=d-1;
 

  while(j<arr1.length){
 int e=-1;
        int l=0;
     int k=0;
 int flag=0;
     while(k!=i){
       if(!arr1[k].equals(arr2[l])){
    
        flag=1;
        break;
       }
      
       k++;
       l++;
     }

     if(flag==0){

        k=j+1;

    
        while(k<arr1.length){
            if(!arr1[k].equals(arr2[l])){
                
        flag=1;
        break;
       }
       

      
       k++;
       l++;
        }
     }

     if(flag==0){
        return true;
     }

     j++;
     i++;
  }


      return false;

     }

     else{
        if(s1.equals(s2)){
            return true;
        }

        return false;
     }

      }

      

      
    
}