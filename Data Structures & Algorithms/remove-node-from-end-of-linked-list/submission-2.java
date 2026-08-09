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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode cur=head;
        ListNode c=head;
        int len=0;
        while(c!=null)
        {
            len++; 
            c=c.next;
        }
        if(len==n)
        return head.next;
        int i=1;
        while(cur!=null&&cur.next!=null)
        {
            if(i==len-n)
            {
                cur.next=cur.next.next;
                break;
            }
            i++;
            cur=cur.next;

        }
        return head;
    }
}
