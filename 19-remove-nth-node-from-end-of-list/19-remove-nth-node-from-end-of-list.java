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
    
    ListNode dummy = new ListNode(-1);

    
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        dummy.next = head;
        ListNode fwdPtr = dummy;
        ListNode behindPtr = dummy;
        
        int count = n;
        while(count > 0){
            fwdPtr = fwdPtr.next;
            count--;
        }
        
        while(fwdPtr.next != null){
            fwdPtr = fwdPtr.next;
            behindPtr = behindPtr.next;
        }
        
        ListNode nodeToDelete = behindPtr.next;
        behindPtr.next = nodeToDelete.next;
        nodeToDelete.next = null;
        
        return dummy.next;
    }
}