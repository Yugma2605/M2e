class Solution {
    public ListNode sortList(ListNode head) {
    //     if(head == null || head.next == null) return head;
    //     ListNode one = head;
    //     ListNode two = head.next;
    //     while(one.next != null)
    //     {
    //         two = one.next;
    //         while(two != null){
    //             if(one.val > two.val){
    //                 int temp = one.val;
    //                 one.val = two.val;
    //                 two.val = temp;
    //             }
    //             two = two.next;
    //         }
    //         one = one.next;
    //     }
    //     return head;
    // }
        
        List<Integer> ls = new ArrayList<Integer>();
        ListNode temp = head;
        while(temp!=null){
            ls.add(temp.val);
            temp = temp.next;
        }
        Collections.sort(ls);
        temp = head;
        int n = ls.size();
        int i = 0;
        while(i < n){
            temp.val = ls.get(i);
            i++;
            temp = temp.next;
        }
        return head;
    }
}