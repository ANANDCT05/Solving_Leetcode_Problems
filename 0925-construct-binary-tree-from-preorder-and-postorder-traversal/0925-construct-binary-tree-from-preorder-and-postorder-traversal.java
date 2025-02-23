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
    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        Queue<TreeNode>q1=new LinkedList<>();
        TreeNode t1=new TreeNode(preorder[0]);
        q1.add(t1);
         int vis[]=new int[31];
        int prer[]=new int[31];
        int postle[]=new int[31];

        for(int i=0;i<preorder.length-1;i++){
            prer[preorder[i]]=preorder[i+1];
        }
        for(int i=postorder.length-1;i>0;i--){
            postle[postorder[i]]=postorder[i-1];
        }
        vis[t1.val]=1;

        while(!q1.isEmpty()){

           int t=q1.size();
           for(int i=0;i<t;i++){
            TreeNode m1=q1.poll();
         
            if(prer[m1.val]!=0 && vis[prer[m1.val]]==0){
                TreeNode v1=new TreeNode(prer[m1.val]);
                vis[prer[m1.val]]=1;
                m1.left=v1;
                q1.add(v1);
            }

            if(postle[m1.val]!=0 && vis[postle[m1.val]]==0){
               TreeNode v1=new TreeNode(postle[m1.val]);
               vis[postle[m1.val]]=1;
               m1.right=v1;
               q1.add(v1);
            }
           }
        }

        return t1;
    }
}