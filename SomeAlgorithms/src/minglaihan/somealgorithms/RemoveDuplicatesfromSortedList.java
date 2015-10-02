package minglaihan.somealgorithms;

public class RemoveDuplicatesfromSortedList {
	//1
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null){
            return head;
        }
        ListNode cur = head;
        ListNode nex = cur.next;
        while(nex!=null){
            if(cur.val==nex.val){
                nex = nex.next;
                if(nex == null){
                    cur.next = null;
                }
            }else{
                cur.next = nex;
                nex = nex.next;
                cur = cur.next;
            }
        }
        
        return head;
    }
    
    //2,delete all duplicate node
    public ListNode deleteDuplicates2(ListNode head) {
        if(head==null){
            return head;
        }
        ListNode fakehead = new ListNode(0);
        fakehead.next = head;
        
        ListNode ptr0 = fakehead;
        ListNode ptr1 = fakehead.next;
        ListNode ptr2 = fakehead.next.next;
        
        boolean flag = false;
        while(ptr2!=null){
            if(ptr1.val == ptr2.val){
                flag = true;
                ptr2 = ptr2.next;
                if(ptr2 == null)
                    ptr0.next = null;
            }else{
                if(flag){
                    ptr0.next = ptr2;
                    flag = false;
                }else{
                    ptr0 = ptr1;
                }
                ptr1 = ptr2;
                ptr2 = ptr2.next;
            }
        }
        return fakehead.next;
    }
}
