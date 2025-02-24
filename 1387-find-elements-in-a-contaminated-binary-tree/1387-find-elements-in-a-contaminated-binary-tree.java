/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class FindElements {
HashMap<Integer,Integer>h1=new HashMap<>();


    public FindElements(TreeNode root) {
          h1.put(0,1);

          Queue<TreeNode>c1=new LinkedList<>();
c1.add(root);
root.val=0;
          while(!c1.isEmpty()){
            int n=c1.size();
            for(int i=0;i<n;i++){
                TreeNode v1=c1.poll();

                if(v1.left!=null){
                  v1.left.val=(v1.val*2)+1;
                  h1.put(v1.left.val,1);
                  c1.add(v1.left);
                }
             if(v1.right!=null){
                v1.right.val=(v1.val*2)+2;
                h1.put(v1.right.val,1);
                c1.add(v1.right);
             }
            }
          }
    }
    
    public boolean find(int target) {
        if(h1.get(target)!=null){

            return true;
        }
       return false;

    }
}

/**
 * Your FindElements object will be instantiated and called as such:
 * FindElements obj = new FindElements(root);
 * boolean param_1 = obj.find(target);
 */