
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null)
        {
            return head;
        }
        ListNode oddstart=head;
        ListNode odd= head;
        ListNode even =head.next;
        ListNode evenstart=head.next;
        while(even!=null && even.next!=null)
        {
            odd.next=odd.next.next;
            even.next=even.next.next;
            odd=odd.next;
            even=even.next;
        }
        odd.next=evenstart;
        return oddstart;
    }
}
