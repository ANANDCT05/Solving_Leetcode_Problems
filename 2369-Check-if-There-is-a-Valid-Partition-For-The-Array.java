class Solution {
    public boolean validPartition(int[] nums) {

Boolean dp[]=new Boolean[nums.length];
   return check(0,nums,dp);  
    }


    public static boolean check(int i,int arr[],Boolean dp[]){

  if(i>=arr.length){
    return true;
}

if(dp[i]!=null){
    return false;
}

        if(valid(i,i+1,arr)==true){
         
         if( check(i+2,arr,dp)==true){
            return true;
         }
        }
        if(valid(i,i+2,arr)==true){
            if( check(i+3,arr,dp)==true){
                return true;
            }
        }

        return dp[i]=false;
    }

    public static boolean valid(int i,int j,int arr[]){


        if(j>=arr.length){
            return false;
        }
int e=0;
        for(int k=i;k<=j-1;k++){

            if(arr[k]!=arr[k+1]){
                e=1;
            }
        }

        if(e==0){
        return true;
        }
        int ne=0;

        for(int k=i;k<=j-1;k++){
            if(arr[k]+1==arr[k+1]){
                ne++;
            }
        }

        if(ne==2){
            return true;
        }

        return false;

    }

}