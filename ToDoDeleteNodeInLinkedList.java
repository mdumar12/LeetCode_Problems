/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        //we are storing this value of the node address.
        ListNode temp = node.next;
        node.val = node.next.val;
        node.next = node.next.next;
        //By passing temp then garbage collector will clear the null below.
        temp = null;
    }
}
