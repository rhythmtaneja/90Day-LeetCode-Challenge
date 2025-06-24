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
         if (head == null) return head;
         int length = 1;
         ListNode dummy = head;
         while (dummy.next != null){
            dummy = dummy.next;
            length++;
         }
         int position = k % length; // if k = 5 and length = 5
         // 5 (or any multiple of 5) mod 5 = 0; hence we'll get the exact same list
         if (position == 0)
            return head;

            ListNode current = head;
            for (int i = 0; i < length - position - 1; i++){
                current = current.next;
            }
            ListNode newHead = current.next;
            dummy.next = head;
            current.next = null;

            return newHead;
         
    }
}
