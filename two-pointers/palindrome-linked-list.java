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
    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> arr = new ArrayList<>();
        ListNode curr = head;
        while(curr!=null){
            arr.add(curr.val);
            curr = curr.next;
        }
        int l = 0, r = arr.size()-1;
        while(l<=r){
            if(arr.get(l)!=arr.get(r)) return false;
            l++;
            r--;
        }
        return true;
    }
}