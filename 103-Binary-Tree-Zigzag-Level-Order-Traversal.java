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
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
       if(root==null){
        return new ArrayList<>();
       } 
        Queue<TreeNode> st1=new LinkedList<>();

        List<Integer> a1=new ArrayList<>();
        List<List<Integer>> a2=new ArrayList<>();
        st1.add(root);

        int t=1;
   

        while(!st1.isEmpty()){
          int n=st1.size();
          a1=new ArrayList<>();
          for(int i=0;i<n;i++){
               TreeNode r=st1.poll();
           a1.add(r.val);
               if(r.left!=null){
                st1.add(r.left);
               }
               if(r.right!=null){
                st1.add(r.right);
               }

          }

          if(t==0){
            Collections.reverse(a1);
            a2.add(a1);
            t=1;
          }
          else{
            a2.add(a1);
            t=0;
          }
        }
        return a2;
    }
}