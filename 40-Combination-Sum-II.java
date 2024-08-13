class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> l1=new ArrayList<>();
        List<Integer> l2=new ArrayList<>();
Arrays.sort(candidates);
        check(l1,l2,candidates,0,target,0);
        return l1;
    }

    public static void check(List<List<Integer>> l1,List<Integer> l2,int c[],int sum,int t,int i){

    if(sum==t){
        List<Integer> l3=new ArrayList<>(l2);
     l1.add(l3);
     return;
    }
    if(sum>t){
        return;
    }

    if(i==c.length){
        return ;
    }


    sum+=c[i];
    l2.add(c[i]);
    check(l1,l2,c,sum,t,i+1);
    while(i<c.length-1 && c[i]==c[i+1]){
        i++;
    }
    sum=sum-c[i];
    l2.remove(l2.size()-1);
    check(l1,l2,c,sum,t,i+1);
    }
}