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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode l[]=new ListNode[k];

        ListNode temp=head;
        int len=0;
        while(temp!=null){
            len++;
            temp=temp.next;
        }

        int q=len/k;
        int r=len%k;
        int p=0;
        temp=head;
        for(int i=0;i<k;i++){
            p=0;
            if(r>0){
                p=1;
            }
            l[i]=temp;
            for(int j=0;j<(q+p)-1;j++){
            temp=temp.next;

            }
            if(temp!=null){
            ListNode n=temp.next;
            temp.next=null;
            temp=n;
            }
           
            r--;
        }

        return l;
    }
}