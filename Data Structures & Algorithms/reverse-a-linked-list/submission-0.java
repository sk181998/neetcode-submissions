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
        Brute Force Approach:
        1. copy the linkedlist element in array.
        2. reverse the array 
        3. copy the reverse array element in linkedlist.
        time complexity will be O(N) and O(N);
        */
        //case where empty linkedlist and one node linkedlist.
        if(head == null || head.next == null)
        {
            return head;
        }
        //Step 1: Copy linkedlist elements into arrayList
        ArrayList<Integer> al = new ArrayList();//O(N)
        ListNode temp = head;
        while(temp != null)//O(N)
        {
            al.add(temp.val);
            temp = temp.next;
        }
        //step 2: reverse arraylist
        int p1 = 0;
        int p2 = al.size() - 1;
        while(p2 > p1)//O(N/2)
        {
            int temporary = al.get(p1);
            al.set(p1,al.get(p2));
            al.set(p2,temporary);
            p1++;
            p2--;  
        }
        //step 3 : copy arraylist element in linkedlist
        temp = head;
        int i = 0;
        while(temp != null)//O(N)
        {
            temp.val = al.get(i);
            temp = temp.next;
            i++;
        }
        return head;  
    }
}
