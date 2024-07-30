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
    public int sumOfLeftLeaves(TreeNode root) {
        

        return check(root,'R');
    }

    public static int check(TreeNode root,char c){

        if(root==null){
            return  0;
        }

        if(root.left==null && root.right==null ){

            if(c=='L'){
            return root.val;
            }
            return 0;
        }


        return check(root.left,'L') +check(root.right,'R');
    }
}