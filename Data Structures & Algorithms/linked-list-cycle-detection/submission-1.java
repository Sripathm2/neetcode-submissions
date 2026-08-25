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
    public boolean hasCycle(ListNode head) {
        HashSet<Integer> set = new HashSet<Integer>();
        while(head != null && head.next!=null){
            if(set.contains(head.val)){
                return true;
            }
            set.add(head.val);
            head = head.next;
        }
        return false;
    }
}
