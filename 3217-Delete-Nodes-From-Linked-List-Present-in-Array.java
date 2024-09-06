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
    public ListNode modifiedList(int[] nums, ListNode head) {
        

    int max=0;

        for(int i=0;i<nums.length;i++){
        if(nums[i]>max){
            max=nums[i];
        }
        }
        int ht[]=new int[max+1];
        for(int i=0;i<nums.length;i++){
            ht[nums[i]]++;
        }
        ListNode prev=null;
        ListNode m=head;
        ListNode n=head.next;

        while(m!=null){
            n=m.next;
            if(m.val <=max &&ht[m.val]>0){
                if(prev==null){
                    head=n;
                }
                else{
                    prev.next=n;
                }

              
            }
            else{
prev=m;

            }
            m=n;
        }

        return head;
    }
}