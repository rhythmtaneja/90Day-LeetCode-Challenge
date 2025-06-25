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
    public void reorderList(ListNode head) {
        if (head == null) return;

        // Step 1 find middle
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2 Reverse the second half of the list
        ListNode second = slow.next;
        slow.next = null;
        ListNode node = null;

        while (second != null){
            ListNode temp = second.next;
            second.next = node;
            node = second;
            second = temp;
        }

        // Step 3 Merge two halves
        ListNode first = head; 
        second = node; // here node = 5;

        // first = 1; second = 5;
        while (second != null){
            ListNode temp1 = first.next; // 2
            ListNode temp2 = second.next; // 4
            first.next = second;
            second.next = temp1;
            first = temp1;
            second = temp2;
        }
    }

}
