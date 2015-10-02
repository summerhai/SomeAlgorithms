package minglaihan.somealgorithms;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}


public class ReverseLinkedList {
	
	//1:
    public ListNode reverseList(ListNode head) {
        if(head==null)
            return head;
        ListNode cur = head;
        ListNode nex = cur.next;
        head.next = null;
        while(nex!=null){
            ListNode temp = nex.next;
            nex.next = cur;
            cur = nex;
            nex = temp;
        }
        return cur;
    }
	
	//2:reverse from m to n
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if (m >= n || head == null) {
            return head;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode preNode = dummy;
        int i=1;
        while(preNode.next!=null&&i<m){
            preNode = preNode.next;
            i++;
        }
        if(i<m){
            return head;
        }
        
        ListNode mNode = preNode.next;
        ListNode cur = mNode.next;
        while(cur!=null&&i<n){
            ListNode next = cur.next;
            cur.next = preNode.next;
            preNode.next = cur;
            mNode.next = next;
            cur = next;
            i++;
        }
        return dummy.next;
    }
}
