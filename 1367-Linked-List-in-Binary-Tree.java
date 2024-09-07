/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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

        
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    public boolean isSubPath(ListNode head, TreeNode root) {
     
List<TreeNode> l1=new ArrayList<>();
check1(root,head,l1);
for(TreeNode n:l1){
    if(check( head,n)){
        return true;
    }
}
return false;
    }


public static void check1(TreeNode r,ListNode h,List<TreeNode>l1){
    if(r==null){
        return;
    }
    if(r.val==h.val){
l1.add(r);
    }

    check1(r.left,h,l1);
    check1(r.right,h,l1);
}

    public static boolean check(ListNode h,TreeNode root){

   if(h==null){
    return true;
   }
   if(root==null){
    return false;
   }

   if(h.val==root.val){
    return check(h.next,root.left)||check(h.next,root.right);
   }

   return false;
    }
}
    