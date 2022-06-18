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
    public ListNode swapPairs(ListNode head) {
        
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        boolean newHeadCreated = false;
        
        if(head == null || head.next == null){
            return head;
        }
        
        while(dummy != null){
            swapNodes(dummy, dummy.next);
            if(!newHeadCreated){
                newHeadCreated = !newHeadCreated;
                head = dummy.next;
            }
            
            dummy = dummy.next;
            if(dummy!= null){
                dummy = dummy.next;
            }
        }
        
        return head;
    }
    
    public void swapNodes(ListNode prev, ListNode first){
        
        ListNode second = null;
        
        if(first != null){
            second = first.next;
            
            if(second != null){
                first.next = second.next;
                second.next = first;
                prev.next = second;
            }
            
        }
        
        
        
    }
    
}