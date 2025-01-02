class Solution {
    public int[] vowelStrings(String[] w, int[][] q) {
        
int pref[]=new int[w.length];

pref[0]=(isvowels(w[0].charAt(0)) && isvowels(w[0].charAt(w[0].length()-1)))?1:0;

for(int i=1;i<w.length;i++){

    if(isvowels(w[i].charAt(0)) && isvowels(w[i].charAt(w[i].length()-1))){
        pref[i]=pref[i-1]+1;
    }
    else{
        pref[i]=pref[i-1];
    }
}

int arr[]=new int [q.length];
for(int i=0;i<arr.length;i++){
int s=pref[q[i][1]];
    if(q[i][0]-1>=0){
        s=s-(pref[q[i][0]-1]);
    }

    arr[i]=s;
}
return arr;

    }

    public static boolean isvowels(char a){

        if(a=='e' || a=='a' || a=='i'|| a=='o' || a=='u'){
            return true;
        }

        return false;
    }
}