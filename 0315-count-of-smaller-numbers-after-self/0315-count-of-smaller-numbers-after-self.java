class Solution {
    Solution(){

    }
    int start;
    int end;
    Solution left;
    Solution right;
    int data;

    Solution(int start,int end){
        this.start=start;
        this.end=end;
        
    }
    public List<Integer> countSmaller(int[] nums) {
        

        Integer n[]=new Integer[nums.length];
        for(int i=0;i<nums.length;i++){
            n[i]=i;

        }
      Comparator<Integer> c1=new Comparator<>(){


        public int compare(Integer a,Integer b){
return Integer.compare(nums[a],nums[b]);
        }
      };
      Arrays.sort(n,c1);
 Integer ans[]=new Integer[nums.length];
   Solution root= insert(0,nums.length);


    for(int i=0;i<nums.length;i++){
    update(n[i],root);

    int start=n[i]+1;
    int end=nums.length-1;
    if(start<=end){
 ans[n[i]]=range(start,end,root);
    }
    else{
        ans[n[i]]=0;
    }
    }
    return Arrays.asList(ans);
    }


    public static Solution insert(int start,int end){

        if(start==end){
            Solution s1=new Solution(start,end);
            s1.data=0;
            s1.left=null;
            s1.right=null;
            return s1;
        }
        Solution s1=new Solution(start,end);

        int mid=(start+end)/2;
      s1.left=insert(start,mid);
      s1.right=insert(mid+1,end);
      s1.data=0;
      return s1;
    }

    public int update(int index,Solution root){

if((root.start==root.end) && (root.start==index)){
    root.data=1;
    return 1;
}
    if(root.start<=index && root.end>=index){

        root.data=update(index,root.left)+update(index,root.right);


    }

    return root.data;
    }
	
	public int range(int start,int end,Solution root) {
		
	
		if(start<=root.start && end>=root.start){
            return root.data;
        }
		
        if((start>=root.start  && start<=root.end ) ||  (end>=root.start && end<=root.end)){


        return range(start,end,root.left)+range(start,end,root.right);
        }
		return 0;
	}
	
}