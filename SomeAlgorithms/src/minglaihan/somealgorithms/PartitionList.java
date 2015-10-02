package minglaihan.somealgorithms;
/**
 * ��������˵����һ��x��ֵ��С��x�����ڴ��ڵ���x��ǰ�棬���Ҳ��ı�����֮��nodeԭʼ�����λ�á�ÿ�ο���������������Σ�����Ϊʲô4��3��ǰ�档����ʵ���ǵ�������⣬4->3->5���Ǵ��ڵ�3�����������Ᵽ��������ԭ�������λ�� ��

���ԣ�������ǲ���Ҫ�κ���������ģ���ⷽ�������

new����������һ�������������д��ڵ���x������һ��������������С��x������

������������ʱ������ǰnode��valС��xʱ������С�����ϣ���֮�����ڴ������ϡ������ͱ�֤�����˳��û�иı䣬������������������x�ıȽ��жϡ�

��󣬰�С������ڴ������ϣ������˰Ѵ�����Ľ�β����null��
 * @author minglaihan
 *
 */
public class PartitionList {
    public ListNode partition(ListNode head, int x) {
        if(head==null)
            return head;
        ListNode small = new ListNode(0);
        ListNode sNode = small;
        ListNode big = new ListNode(0);
        ListNode bNode = big;
        
        while(head!=null){
            if(head.val<x){
                small.next = head;
                small = small.next;
            }else{
                big.next = head;
                big = big.next;
            }
            head = head.next;
        }
        big.next = null;
        small.next = bNode.next;
        
        return sNode.next;
    }
}
