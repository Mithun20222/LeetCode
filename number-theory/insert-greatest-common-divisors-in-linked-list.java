class Solution {
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode curr = head;

        while (curr != null && curr.next != null) {
            int gcdVal = gcd(curr.val, curr.next.val);
            ListNode newNode = new ListNode(gcdVal);
            newNode.next = curr.next;
            curr.next = newNode;
            curr = newNode.next;
        }
        return head;
    }

    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
