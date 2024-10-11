/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
   
   if(head==null){
    return  null;
   }
        Node n=new Node(head.val);
        Node f=n;
        Node t=head.next;
  HashMap<Node,Node> h1=new HashMap<>();
  h1.put(head,n);

        while(t!=null){
            Node m=new Node(t.val);
            h1.put(t,m);
            f.next=m;
            f=m;
            t=t.next;
         }

         Node m=n;
         Node t1=head;

         while(t1!=null){
           
            m.random=h1.get(t1.random);
            
            
            m=m.next;
            t1=t1.next;
         }
         return n;
    }
}