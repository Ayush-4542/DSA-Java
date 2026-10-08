/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
// space O(n)
/*
public class Solution {
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> set = new HashSet<>();
        
        ListNode currNode = head;
        while(currNode!=null){
            if(set.contains(currNode)){
                return true;
            }
            set.add(currNode);
            currNode = currNode.next;

        }
        return false;
    }
}
*/
// more optimized : space O(1)
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast= fast.next.next;
            if(slow== fast){
                return true;
            }
        }
        return false;
        
    }
}
