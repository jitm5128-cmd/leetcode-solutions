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
    public ListNode reverseBetween(ListNode head, int left, int right) {
         // If only one node or no reverse needed
        if (head == null || left == right) {
            return head;
        }

        // Dummy node to handle edge cases
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        // Move prev to node before "left"
        ListNode prev = dummy;
        for (int i = 1; i < left; i++) {
            prev = prev.next;
        }

        // Start reversing
        ListNode curr = prev.next;
        
        for (int i = 0; i < right - left; i++) {
            ListNode next = curr.next;

            curr.next = next.next;
            next.next = prev.next;
            prev.next = next;
        }

        return dummy.next;
    }
}