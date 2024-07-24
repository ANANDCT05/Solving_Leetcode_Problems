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
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null){
            return head;
        }

        ListNode temp=head;
        ListNode e=head;
        int t=0;
       while(true){
        while(t<k &&e!=null ){
            e=e.next;
            t++;
        }

        if(e==null){
            e=head;
        }

        if(t==k){
            break;
        }
       }

        while(e.next!=null){
            temp=temp.next;
            e=e.next;
        }

        e.next=head;
        head=temp.next;
        temp.next=null;
        return head;
    }
}