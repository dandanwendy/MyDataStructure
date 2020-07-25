package leetcode.shuaTi.wendyHot100.List;

public class ReverseList {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next=new ListNode(2);
        l1.next.next=new ListNode(3);
        l1.next.next.next=new ListNode(4);
        l1.next.next.next.next=new ListNode(5);

        reverseList(l1);

        while(l1!=null){
            System.out.println(l1.val);
            l1 = l1.next;
        }
    }

    public static ListNode reverseList(ListNode head) {
        ListNode crr = new ListNode(-1);
        ListNode crr1 = null;
        while(head!=null){
            crr1 = crr.next;
            ListNode l = new ListNode(head.val);
            crr.next=l;
            l.next=crr1;
            head=head.next;
        }
        return crr.next;

    }
}
