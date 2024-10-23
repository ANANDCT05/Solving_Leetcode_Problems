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
    public TreeNode replaceValueInTree(TreeNode root) {
        

        Queue<TreeNode> q1=new LinkedList<>();
        int cur=root.val;
        int nex=0;
q1.add(root);
        while(!q1.isEmpty()){
            int n=q1.size();
            nex=0;
            for(int i=0;i<n;i++){
int sib=0;
                TreeNode p1=q1.poll();
                p1.val=cur-p1.val;

                if(p1.left!=null){
                    nex+=p1.left.val;
                   sib+=p1.left.val;
                   q1.add(p1.left);
                }

                if(p1.right!=null){
                 nex+=p1.right.val;
                 sib+=p1.right.val;
                 q1.add(p1.right);

                }

                if(p1.left!=null){
                    p1.left.val=sib;
                }
                if(p1.right!=null){
                    p1.right.val=sib;
                }
            }

            cur=nex;
        }

        return root;
    }
}