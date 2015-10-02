package minglaihan.somealgorithms;

public class RemoveNthNodeFromEndofList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null||n<=0){
            return head;
        }
        ListNode slow = head;
        ListNode fast = head;
        
        for(int i=0;i<n;i++){
            fast = fast.next;
        }
        if(fast==null){
            head = head.next;
            return head;
        }
        while(fast.next!=null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
        
    }
}
