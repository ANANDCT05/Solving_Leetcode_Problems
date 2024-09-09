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
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        
int mat[][]=new int[m][n];
        ListNode temp=head;
        int count=0;
        int e=m*n;
int k=0;
int l=1;
int p=1;
int i=0;
int j=0;
        while(count!=e){
int t=0;
            while(t<n-k){
                if(temp!=null){

                
               mat[i][j]=temp.val;
               temp=temp.next;
                }
                else{
                    mat[i][j]=-1;
                }
                j=j+p;
                t++;
               count++;
            }
            j=j-p;
            i=i+(p);
            k++;
            t=0;
            while(t<m-l){
                if(temp!=null){
                    mat[i][j]=temp.val;
                    temp=temp.next;
                }

                else{
                    mat[i][j]=-1;
                }

                i=i+p;
               t++;

               count++;
            }
            t=0;
            i=i-p;
        p=-p;
        l++;
        
        j=j+p;
        }

        return mat;
    }
}