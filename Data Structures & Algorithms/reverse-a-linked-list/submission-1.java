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
    public ListNode reverseList(ListNode head) {
        /*
        In brute force approach we are taking O(N) space.
        can we optimize this without taking array or arraylist can we do this..
        */
        if(head == null || head.next == null)
        {
            return head;
        }
        ListNode curr = head;
        //its just helper variable to store the next node before change the links.
        //prev will become the previous node in the reversed list. 
        //It starts as null because the new tail (original head) should point to null.
        ListNode prev = null;
        ListNode temp;
        while(curr != null)
        {
            temp = curr.next;//1
            curr.next = prev;//null
            //make the current node point to the previous node in the reversed list.
            prev = curr;//0
            curr = temp;//1
        }
        head = prev;//3
        return head;
    }
}
