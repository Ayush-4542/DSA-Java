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
/*
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
*/
// MORE EFFICIENT SOLUTION
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
        if(head ==null || head.next==null){
            return null;
        }
        ListNode slow= head;
        ListNode fast = head;
        ListNode pointer = head;
        while(fast!=null && fast.next!=null){
            slow= slow.next;
            fast= fast.next.next;
            if(slow==fast){ // slow se start krenge aur ek pointer head, se wo khi na khi jake jrur milenge 
                while(slow!=pointer){    // jha slow==pointer hoga whi se cycle start hua hoga
                    slow= slow.next;
                    pointer = pointer.next;
                }
                return pointer;
            }
        }
        return null;
        
    }
}
