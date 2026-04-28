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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null) return list2;
        if(list2 == null) return list1;
        ListNode p1 = list1;
        ListNode p2 = list2;
        ListNode temp = list1;
        ListNode p3 = list1;
        if(p1.val < p2.val)
        {
            p3 = p1;//2
            temp = p1;//2
            p1 = p1.next;//null
        }
        else
        {
            p3 = p2;
            temp = p2;
            p2 = p2.next;
        }
        while(p1 != null && p2 != null)
        {
            if(p1.val < p2.val)
            {
                temp.next = p1;
                p1 = p1.next;
            }
            else
            {
                temp.next = p2;
                p2 = p2.next;
            }
            temp = temp.next; 
        }
        if(p1 == null)
        {
            temp.next = p2;
        }
        else//p2== null
        {
            temp.next = p1;
        }
        return p3;
    }
}