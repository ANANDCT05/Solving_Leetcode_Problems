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
    public List<Integer> preorder(Node root) {
        Stack<Node>s1=new Stack<>();
        ArrayList<Integer> a1=new ArrayList<>();
     if(root!=null){
        s1.add(root);
     }
        while(!s1.isEmpty()){
            

            Node m=s1.pop();
            a1.add(m.val);
           for(int i=m.children.size()-1;i>=0;i--){
            if(m.children.get(i)!=null){
            s1.add(m.children.get(i));
            }
           }

        }

        return a1;
    }
}