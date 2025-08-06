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
    public ListNode removeElements(ListNode head, int val) {
        if(head == null){
            return head;
        }
        if(head.next == null && head.val==val){
            return null ;
        }
        ListNode temp = head;
        ListNode prev = new ListNode();
        ListNode ans = prev;
        while(temp!=null){
            if(temp.val != val){
                prev.next = temp;
                prev = prev.next;
            }
            temp=temp.next;
            prev.next=null;
        }
        return ans.next;
    }
}