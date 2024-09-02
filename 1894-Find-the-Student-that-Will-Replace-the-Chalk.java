class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        int i=0;
        int n=chalk.length;
long sum=0;
        while(i<n){

          sum=(sum+chalk[i]);
          i++;
        }

        int r=(int)(k%sum);

i=0;
while(r>0){


if(chalk[i]>r){
    break;
}
else{
    r=r-chalk[i];
}
i=i+1;

}
return i;
        
    }
}