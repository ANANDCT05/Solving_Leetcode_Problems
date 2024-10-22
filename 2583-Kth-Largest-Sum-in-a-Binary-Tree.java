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
    public long kthLargestLevelSum(TreeNode root, int k) {
         if(root==null){
            return -1;
         }
       
        PriorityQueue<Long>p1=new PriorityQueue<>(Collections.reverseOrder());
        Queue<TreeNode> q1=new LinkedList<>();
     long sum=0;

        q1.add(root);


        while(!q1.isEmpty()){
            int n=q1.size();
            sum=0;
            for(int i=1;i<=n;i++){
                TreeNode e=q1.poll();
sum+=e.val;

if(e.left!=null){
    q1.add(e.left);
}

if(e.right!=null){
    q1.add(e.right);
}
            }
            p1.add(sum);

        }
long v=0;
        while(k>0){

            if(p1.isEmpty()){
                return -1;
            }
            v=p1.poll();
            k--;

            
        }

        return v;
    }
}