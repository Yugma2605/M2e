public class Solution {
    public ListNode detectCycle(ListNode head) {
        HashSet<ListNode> set = new LinkedHashSet<>();
        while(head != null){
            if(set.contains(head)){
                return head;
            }
            set.add(head);
            head = head.next;
        }
        return head;
       
    }
}