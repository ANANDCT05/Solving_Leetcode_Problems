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
    int c=0;
    public int distributeCoins(TreeNode root) {
        

     check(root);
     return c;
    }


    public int check(TreeNode root){

        if(root==null){
            return 0;
        }

        

        int a=check(root.left);
        int b=check(root.right);
        int e=0;
        int n=0;
         if(root.val>1){
        e=root.val-1;
        }

        else if(root.val==0){
            n--;
        }
c+=Math.abs(a);
c+=Math.abs(b);

     
        return a+b+e+n;

    }
}