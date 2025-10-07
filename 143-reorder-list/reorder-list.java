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
    public void reorderList(ListNode head) {
        int length = 0;
        ListNode temp = head;
        while(temp!=null){
            length++;
            temp=temp.next;
        }

        List<ListNode> ls1 = new ArrayList<>();
        List<ListNode> ls2 = new ArrayList<>();

        int half = length/2;
        int nextHalf = length/2;
        ListNode n = head;
        while(half>0){
            ls1.add(n);
            half--;
            n = n.next;
        }
        while(nextHalf!=length){
            ls2.add(n);
            nextHalf++;
            n = n.next;
        }
        int i=1;
        int j = ls2.size()-1;
        ListNode tempHead = head;
        while(i<ls1.size()&&j>=0){
            tempHead.next = ls2.get(j);
            tempHead = tempHead.next;
            tempHead.next = ls1.get(i);
            tempHead = tempHead.next;
            j--;
            i++;
        }
        while(j>=0){
            tempHead.next = ls2.get(j);
            tempHead = tempHead.next;
            j--;
        }
        tempHead.next = null;
    }
}