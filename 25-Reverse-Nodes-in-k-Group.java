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
    public ListNode reverseKGroup(ListNode head, int k) {
        
        ListNode l1=head;
       ListNode start=l1;
    
        int t=0;

        while(l1!=null){

            t=0;
            start=l1;
        while(t<k && l1!=null)
            
            l1=l1.next;
            t++;
        }

        if(t==k){
            t=0;
            ListNode prev=null;
            ListNode temp=start;
            ListNode nexts=null;
            while(t<k ){
             nexts=temp.next;
             temp.next=prev;
             t++;
             temp=nexts;
            }
        }
    }


    public static void reverse(ListNode start,ListNode end,ListNode point){
          


    }
}