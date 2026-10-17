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
    public ListNode detectCycle(ListNode head) {
        if(head==null || head.next==null){
            return null;
        }
        HashSet<ListNode> set = new HashSet<>();
        ListNode currNode = head;
        while(currNode!=null){
            if(set.contains(currNode)){
                return currNode;
            }
            set.add(currNode);
            currNode = currNode.next;
        }
        return null;
        
    }
}
