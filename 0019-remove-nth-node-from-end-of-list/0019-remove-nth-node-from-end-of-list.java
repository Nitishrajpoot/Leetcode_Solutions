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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null)  return head;

        ListNode temp=head;
        int sz=0;
        while(temp!=null){
          sz++;
          temp=temp.next;
        }
        if(sz==n) return head.next;

        int Find=sz-n;
        int i=1;
        ListNode prev=head;
        while(i<Find){
            prev=prev.next;
            i++;
        }
        if(prev.next==null) return head;
        prev.next=prev.next.next;
        return head;
    }
}