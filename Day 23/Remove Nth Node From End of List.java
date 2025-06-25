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
        ListNode res = new ListNode(0,head);
        ListNode dummy = res; // coz we have to stop at 3

        for (int i = 0; i<n; i++){
            head = head.next;
        }
        while (head != null){
            head = head.next; // at the end head = 0
            dummy = dummy.next; // when head = 0; dummy = 3 thus starting from head -1
        }
        dummy.next = dummy.next.next;
        return res.next;
    }
}
