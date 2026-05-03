class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        long num1 = 0;
        long multiplier = 1;

        // Convert l1 to number
        while (l1 != null) {
            num1 += l1.val * multiplier;
            multiplier *= 10;
            l1 = l1.next;
        }

        long num2 = 0;
        multiplier = 1;

        // Convert l2 to number
        while (l2 != null) {
            num2 += l2.val * multiplier;
            multiplier *= 10;
            l2 = l2.next;
        }

        long sum = num1 + num2;

        // If result is 0
        if (sum == 0) {
            return new ListNode(0);
        }

        // Convert sum back to linked list
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        while (sum > 0) {
            int digit = (int)(sum % 10);
            current.next = new ListNode(digit);
            current = current.next;
            sum /= 10;
        }

        return dummy.next;
    }
}