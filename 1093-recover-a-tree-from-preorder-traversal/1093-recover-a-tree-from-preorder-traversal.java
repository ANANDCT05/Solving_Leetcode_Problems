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
     
        static int i=0;
    public TreeNode recoverFromPreorder(String traversal) {
        String arr[]=traversal.split("[0-9]+");
        String arr1[]=traversal.split("-+");

   
       i=0;
       if(arr.length==0){
        return new TreeNode(Integer.parseInt(arr1[i]));
       }
           
      TreeNode t1=new TreeNode();

       check(t1,-1,arr1,arr);

       return t1.left;

    
                            

    }

public static void check(TreeNode n1,int prev,String arr1[],String arr[]){

    if(i>=arr1.length){
        return;
    }

    if(( prev<arr[i].length()) ){

     TreeNode n2=new TreeNode(Integer.parseInt(arr1[i]));
        if(n1.left==null){
          n1.left=n2;
          
        }
        else{
            n1.right=n2;
        }
      int ind=i;
      i++;
        check(n2,arr[ind].length(),arr1,arr);
        check(n2,arr[ind].length(),arr1,arr);
    }

    return;
}

}