class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        

    int j=0;
    int max=0;
    int min=0;

    for(int i=1;i<arrays.size();i++){
        List<Integer>l1=arrays.get(max);
        List<Integer>l3=arrays.get(min);
        List<Integer>l2=arrays.get(i);
        if(l1.get(l1.size()-1)<l2.get(l2.size()-1)){
            max=i;
        }

        if(l2.get(0)<l3.get(0)){
            min=i;
        }
    }

    if(min!=max){
        return Math.abs(arrays.get(max).get(arrays.get(max).size()-1)-arrays.get(min).get(0));
    }
else{

    int d=min;

max=Integer.MIN_VALUE;

for(int i=0;i<arrays.size();i++){

List<Integer> l1=arrays.get(i);
if(i!=d && l1.get(l1.size()-1) >max){
    max=l1.get(l1.size()-1);
}
}

int ans1=Math.abs(max-arrays.get(min).get(0));
min=Integer.MAX_VALUE;
for(int i=0;i<arrays.size();i++ ){
    List<Integer> l1=arrays.get(i);
    if(i!=d && l1.get(0)<min){
        min=l1.get(0);
    }
}

int ans2=Math.abs(arrays.get(d).get(arrays.get(d).size()-1)-min);


return Math.max(ans1,ans2);
}
    }
}