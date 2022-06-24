class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int len = 0;
        ListNode temp = head;
        while(temp.next!=null)
        {
            temp = temp.next;
            len++;
        }
        len++;
        if(len == n ) return head.next;
        int k = len - n;
        temp = head;
        while(k!=1)
        {
            temp = temp.next;
            k--;
        }
        temp.next = temp.next.next;
        return head;
    }
}