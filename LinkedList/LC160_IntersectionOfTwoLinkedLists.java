/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashSet<ListNode> set = new HashSet<>();
        ListNode currNode = headA;
        while(currNode!=null){
            set.add(currNode);
            currNode = currNode.next;
        }
        currNode = headB;
        while(currNode!=null){
            if(set.contains(currNode)){
                return currNode;
            }
            currNode = currNode.next;
        }
        return null;
        
    }
}
