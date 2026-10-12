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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null) return head;
        if(head.next==null){
            head= head.next;
            return head;
        }
       
        int count =0;
        ListNode currNode=head;
        while(currNode!=null){
            count++;
            currNode= currNode.next;
        }
        int length =0;
        if(count-n==0){
            head=head.next;
            return head;
        }
        currNode= head;
        while(currNode!=null && currNode.next!=null){
            length++;
            if(count-n==length){
                currNode.next = currNode.next.next;
                
            }
            currNode = currNode.next;
        }
        return head;
    }
}
*/
// More efficient Approach
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null) return head;
        ListNode dummy = new ListNode(-1);
        dummy.next= head;
        ListNode fast = dummy;
        ListNode slow = dummy;
        int k=n;
        while(k-->0){
            fast = fast.next;
        }
        while(fast.next!=null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return dummy.next;
        
    }
}
