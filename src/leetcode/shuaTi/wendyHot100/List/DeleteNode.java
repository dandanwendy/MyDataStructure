package leetcode.shuaTi.wendyHot100.List;

public class DeleteNode {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next=new ListNode(2);
        l1.next.next=new ListNode(3);
        l1.next.next.next=new ListNode(4);
        l1.next.next.next.next=new ListNode(5);

        removeNthFromEnd(l1,2);

        while(l1!=null){
            System.out.println(l1.val);
            l1 = l1.next;
        }
    }


    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode head1 = head;
        int num = 0;

        //遍历得到链表的长度
        while(head!=null){
            num++;
            head = head.next;
        }
        int a=num-n;
        head = head1;

        //删除头结点
        if(a==0){
            head1 = head.next;
            return head1;
        }

        //要删除某个结点，先遍历到它前一个结点，所以是大于1
        while(a>1){
            head = head.next;
            a--;
        }
        head.next=head.next.next;
        return head1;

    }
}
