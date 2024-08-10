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
    public boolean isBalanced(TreeNode root) {
        

      int a=  check(root);
      if(a==-2){
        return false;
      }
      return true;
    }


    public static int check(TreeNode root){


        if(root==null){
            return 0;
        }

        int left=check(root.left)+1;
        int right=check(root.right)+1;

if(left==-1 || right==-1){
    return -2;
}
        int ans=Math.abs(left-right);
     if(ans>1){
    return -2;
}

return Math.max(left,right);

    }
}