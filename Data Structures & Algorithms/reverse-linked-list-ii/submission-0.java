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
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode lp = dummy;
        ListNode cur = head;

        for(int i=0;i<left-1;i++)
        {
            lp = cur;
            cur = cur.next;
        }   

        ListNode prev = null;
        for(int i=0;i<right-left+1;i++)
        {
            ListNode tn = cur.next;
            cur.next = prev;
            prev = cur;
            cur = tn;
        }

        lp.next.next = cur;
        lp.next = prev;

        return dummy.next;
    }
}