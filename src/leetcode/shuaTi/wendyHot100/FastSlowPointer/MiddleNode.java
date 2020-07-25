package leetcode.shuaTi.wendyHot100.FastSlowPointer;

public class MiddleNode {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast!=null){
            slow = slow.next;
            if(fast.next!=null){
                fast = fast.next.next;
            }else{
                fast = null;
            }
        }
        return slow;
    }
}
