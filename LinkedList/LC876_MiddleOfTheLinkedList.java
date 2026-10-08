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
/*
class Solution {
    public ListNode middleNode(ListNode head) {
        if(head.next==null) return head;
        int nodeLen=0;
        ListNode currNode = head;
        while(currNode!=null){
            nodeLen++;
            currNode= currNode.next;

        }
        int count =0;
        currNode = head;
        while(currNode!=null){
            count++;
            if(count == nodeLen/2 +1){
                return currNode;
            }
            currNode = currNode.next;
        }
        return currNode;
        
    }
}
*/
// more optimized solution 
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
    public ListNode middleNode(ListNode head) {
        if(head.next==null){
            return head;
        }
        ListNode slow= head;
        ListNode fast = head;
        while(fast!= null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;

        
    }
}
