package leetcode.shuaTi.wendyHot100.List;

public class RotateList {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next=new ListNode(2);
        l1.next.next=new ListNode(3);
        l1.next.next.next=new ListNode(4);
        l1.next.next.next.next=new ListNode(5);
        ListNode lr = rotateRight(l1,2);

        while(lr!=null){
            System.out.println(lr.val);
            lr = lr.next;
        }
    }
    //我的这个方法会超出时间限制
    public static ListNode rotateRight(ListNode head, int k) {
        //System.out.println(k);
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        while(k>0){
            ListNode new_tail = null;
            ListNode new_head = null;
            int leng = 0;

            head = dummy.next;
            System.out.println(head.val);

            //找到末尾结点
            while(head!=null){
                leng++;
                new_head = head;
                head = head.next;
            }

            head = dummy.next;
            System.out.println(head.val);
            for(int i=0;i<leng-1;i++){
                new_tail = head;
                head = head.next;
            }
            new_head.next = dummy.next;
            new_tail.next = null;
            //把最后的结点提到前面

            dummy.next = new_head;
            while(new_head!=null){
                System.out.println("tttt   "+new_head.val);
                new_head = new_head.next;
            }

            k--;
            System.out.println("dummy   "+dummy.next.next.val);


            }
     return dummy.next;
    }
}
