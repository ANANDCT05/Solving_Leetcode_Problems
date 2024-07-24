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
    public ListNode oddEvenList(ListNode head) {
        
if(head==null|| head.next==null){
    return head;
}
        ListNode first=head.next;


    ListNode  temp=head;

    ListNode prev=null;
    int count=0;
    
    while(temp!=null && temp.next!=null){
    
      count++;
        prev=temp;
        ListNode n=temp.next;
        temp.next=temp.next.next;
        temp=n;

        
    }

    if(count%2!=0){
        prev.next=first;
    }
    else{
        temp.next=first;
    }

    
    

    return head;
    }
}