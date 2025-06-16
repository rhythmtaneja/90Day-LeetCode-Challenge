/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode temp = head;
        if (head == null || head.next == null){
            return false;
        }
        temp = temp.next;
        if (temp != null) {
            return true;
        }
        return false;
    }
}
