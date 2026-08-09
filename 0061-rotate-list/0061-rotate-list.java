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

        if(head == null || head.next == null || k==0)
            return head;

        int sz = 1;
        ListNode temp = head;

        // find length and tail
        while(temp.next != null){
            temp = temp.next;
            sz++;
        }

        k = k % sz;

        if(k==0)
            return head;

        // make circular
        temp.next = head;


        // find new tail
        int steps = sz-k;

        while(steps-- > 0){
            temp = temp.next;
        }


        // new head
        ListNode newHead = temp.next;

        // break cycle
        temp.next = null;


        return newHead;
    }
}