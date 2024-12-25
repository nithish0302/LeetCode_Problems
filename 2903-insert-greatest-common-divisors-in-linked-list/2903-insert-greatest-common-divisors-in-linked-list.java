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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head==null)
        return head;
        ListNode temp=head;
        while(temp.next!=null)
        {
            ListNode temp1=euclid(temp.val,temp.next.val);
          temp1.next = temp.next;
            temp.next = temp1;
            temp = temp1.next;
        }
        return head;
    }   

    public ListNode euclid(int a, int b) {
        while (b != 0) {
            int rem = a % b;
            a = b;
            b = rem;
        }
        ListNode tmp=new ListNode(a);
        return tmp;
    }
}