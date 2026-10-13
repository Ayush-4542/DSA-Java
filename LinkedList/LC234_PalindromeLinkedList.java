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
        if(head==null || head.next == null) return true;
        ListNode slow= head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        // for odd no. of list 
        if(fast!=null){
            slow = slow.next;
        }
        ListNode prevNode = slow;
        ListNode currNode = slow.next;
        while(currNode!=null){
            ListNode nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
        }
        slow.next = null;
        ListNode firstHalf = head;
        ListNode secondHalf = prevNode;
        while(secondHalf!=null){
            if(secondHalf.val != firstHalf.val){
                return false;
            }
            secondHalf = secondHalf.next;
            firstHalf = firstHalf.next;
        }
        return true;
        
    }
}
