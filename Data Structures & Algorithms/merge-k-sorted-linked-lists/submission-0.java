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
    public ListNode mergeKLists(ListNode[] lists) {
       List<Integer>node=new ArrayList<>();
       for(ListNode li:lists)
       {
        while(li!=null)
        {
        node.add(li.val);
        li=li.next;
        }
       }
       Collections.sort(node);
    
    ListNode res=new ListNode(0);
    ListNode cur=res;
    for(int no:node)
    {
        cur.next=new ListNode(no);
        cur=cur.next;
    }
    return res.next;
    }
}
