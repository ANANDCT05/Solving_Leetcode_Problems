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
    public ListNode mergeKLists(ListNode[] lists) {
        
        List<ListNode>l1=new ArrayList<ListNode>();

        for(int i=0;i<lists.length;i++){
            ListNode l2=lists[i];
            while(l2!=null){
            if(l1.size()>=1){
                ListNode l3=l1.get(l1.size()-1);
                l3.next=l2;
                
            }
            l1.add(l2);

            upheap(l1,l1.size()-1);
            l2=l2.next;
         
            }
        }
     //   if(l1.size()>=1){

    //    l1.get(l1.size()-1).next=null;
      //  }

        
int n=l1.size();

        List<ListNode>l3=new ArrayList<>();
        for(int i=0;i<n;i++){
            ListNode l4=down(l1,l1.size()-1);
            if(l3.size()>=1){
                l3.get(l3.size()-1).next=l4;
            }

            l3.add(l4);
        }

        if(l3.size()==0){
            return null;
        }

l3.get(l3.size()-1).next=null;
        return l3.get(0);
    }



    public static void upheap(List<ListNode> l1 ,int s){
  int p=(s-1)/2;

  if(p>=0){

    if(l1.get(p).val>l1.get(s).val){
         int t=l1.get(p).val;
         l1.get(p).val=l1.get(s).val;
         l1.get(s).val=t;
           upheap(l1,p);

    }
  }
    }


  public static void downheap(List<ListNode>l1,int i){

    int le=(i*2+1);
    int r=(i*2+2);
    int s=i;

    if(le<l1.size()  && l1.get(le).val<l1.get(s).val){
        s=le;
    }

    if(r<l1.size() && l1.get(r).val<l1.get(s).val){
        s=r;
    }

    if(s!=i){
        ListNode t=l1.get(i);
        l1.set(i,l1.get(s));
        l1.set(s,t);
        downheap(l1,s);
    }
  }


  public static ListNode down(List<ListNode> l1,int s){
if(s==0){
    return l1.get(0);

}
    ListNode l=l1.get(0);
    ListNode t=l1.get(0);
    l1.set(0,l1.get(s));
    l1.set(s,t);
    l1.remove(s);
    downheap(l1,0);
    return l;
  }
    }
