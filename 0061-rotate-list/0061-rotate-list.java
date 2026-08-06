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
        if(head==null || head.next==null) return head;
        ListNode slow = head;
        ListNode fast = head;
        int size = 0;
        ListNode node = head;
        while(node != null){
            size++;
            node = node.next;
        }
        k = k%size;
        while(k-- > 0){
            
            fast = fast.next;
        }
        
        while(fast.next!=null){
            slow = slow.next;
            fast = fast.next;
        }
        fast.next = head;
        node = slow.next;
        slow.next = null;
        return node;
    }
}