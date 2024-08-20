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
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        if(root==null){
            return new ArrayList<>();
        }

       List<Integer> a1=new ArrayList<>();
       List<List<Integer>> a2= new ArrayList<>();

       TreeNode q[]=new TreeNode[5000];

       q[0]=root;
       int l=0;
       int r=0;
        
       int k=0;
       while(l<=r){
        if(q[l]!=null){
          r++;
          q[r]=q[l].left;
          r++;
          q[r]=q[l].right;
         
          
        }
        l++;
        
      }

       int p=0;
   l=0;
 int count=2;
 int count1=1;
       while(l<=r){
      
       
        count=count1;
        count1=0;
        int i=1;
        while(i<=count){
            if(q[l]!=null){
                a1.add(q[l].val);
              count1=count1+2;
            }
            l++;
            i++;
        }
        if(!a1.isEmpty()){
        a2.add(a1);
        }
        a1=new ArrayList<>();
      
       }
       



       return a2;

    }
}