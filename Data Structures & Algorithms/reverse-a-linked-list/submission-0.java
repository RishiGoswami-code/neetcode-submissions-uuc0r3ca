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
    public ListNode reverseList(ListNode head) {
        ListNode tempNode;
        int count = 0;
        if (head == null) return null;
        ListNode reverseLL = new ListNode(head.val);
        
        head = head.next; 

        while (head != null) { 
            tempNode = reverseLL;
            reverseLL = new ListNode(head.val); 
            reverseLL.next = tempNode;
            head = head.next;
        }   
        return reverseLL;
    }
}
