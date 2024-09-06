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
        

        HashMap<Integer,Integer> h1=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            h1.put(nums[i],1);
        }
        ListNode prev=null;
        ListNode m=head;
        ListNode n=head.next;

        while(m!=null){
            n=m.next;
            if(h1.get(m.val)!=null){
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