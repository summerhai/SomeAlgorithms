package minglaihan.somealgorithms;

public class RotateList {
    public ListNode rotateRight(ListNode head, int n) {
        if(head==null||n<=0){
        	return head;
        }
        ListNode slow = head;
        ListNode fast = head;
        ListNode cur = head;
        ListNode newHead = new ListNode(0);
        int len = 0;
        while(cur!=null){
            len++;
            cur = cur.next;
        }
        
        n = n%len;
        if(n==0){
            return head;
        }
        for(int i=0;i<n;i++){
            fast = fast.next;
        }
        while(fast.next!=null){
            slow = slow.next;
            fast = fast.next;
        }
        
        newHead = slow.next;
        fast.next = head;
        slow.next = null;
        
        return newHead;
        
    }
}
