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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        
        ListNode l=head;
        ListNode l1=head.next;

        while(l!=null && l1!=null){
            ListNode temp=l1;
           

            int a =gcd(l.val,l1.val);

            ListNode n1=new ListNode(a);
            l.next=n1;
            n1.next=temp;
            l=l1;
            l1=l1.next;
        }

        return head;
    }


    public int gcd(int a,int b){
          if(a==1  || b==1){
            return 1;
          }
          if(b>a){
            int t=a;
            a=b;
            b=t;
          }

          while(b!=0){
            int t=b;
            b=a%b;
            a=t;
          }

          return a;
    }
}