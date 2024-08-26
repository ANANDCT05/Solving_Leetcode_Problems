/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<Integer> postorder(Node root) {
        
List<Integer> l1=new ArrayList<>();

if(root==null){
    return l1;
}
        check(root,l1);
        l1.add(root.val);
        return l1;
    }

    public static void check(Node r,List<Integer> l1){
        if(r==null){
            return;
        }


        List<Node>l2=r.children;

        for(Node r3:l2){
            check(r3,l1);
            l1.add(r3.val);
        }
      
    }
}