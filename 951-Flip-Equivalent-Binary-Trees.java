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
    public boolean flipEquiv(TreeNode root1, TreeNode root2) {
        TreeNode temp1=root1;
        TreeNode temp2=root2;
        
      

        return check(temp1,temp2);
    }

    public static boolean check(TreeNode temp1,TreeNode temp2){

       if(temp1==null && temp2==null){
        return true;
       }

       if(temp1==null && temp2!=null ){
    return false;
       
}
if(temp2==null && temp1!=null){
    return false;
}

if(temp1.val!=temp2.val){
    return false;
}
    

         if(equal(temp1.left,temp2.left,temp1.right,temp2.right)){
            return (check(temp1.left,temp2.left) && check(temp1.right,temp2.right));
         }

         else if(equal(temp1.right,temp2.left,temp1.left,temp2.right)){

            return (check(temp1.right,temp2.left) && check(temp1.left,temp2.right));
         }
     return false;
    
        }
    

    public static boolean equal(TreeNode l1,TreeNode l2,TreeNode r1,TreeNode r2){
  
  
  if(l1==null ){

    if(l2!=null){
    return false;
    }


  }
  else if(l2==null){
    return false;
  }
else {
    if(l1.val!=l2.val){
        return false;
    }
}

 if(r1==null ){

    if(r2!=null){
    return false;
    }


  }
  else if(r2==null){
    return false;
  }
else {
    if(r1.val!=r2.val){
        return false;
    }
}

return true;

    }


      


        
    }
