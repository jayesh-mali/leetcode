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
        if(node == null || node.next==null)
            return;
        ListNode prev = node;
        node = node.next;
        while(node.next!=null){
            prev.val = node.val;
            prev = node;
            node = node.next;
        }
        prev.val = node.val;
        prev.next = null;
    }
}