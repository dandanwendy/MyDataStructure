package leetcode.shuaTi.wendyHot100.Recursive;

public class MergeTwoLists {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        ListNode l2 = new ListNode(1);
        System.out.println(mergeTwoLists(l1,l2));

    }
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l2==null){
            return l1;
        }else if(l1==null){
            return l2;
        }

      ListNode head = new ListNode(l1.val);
      head.next = l1;
      ListNode cur = head.next;
      while(l2!=null){

          if(cur.val<=l2.val && cur.next!=null && cur.next.val>=l2.val){
              ListNode newNode = new ListNode(l2.val);
              newNode.next = cur.next;
              cur.next = newNode;
              l2 = l2.next;
              cur = head.next;
              continue;
          }else if(l2.val<head.next.val){
              ListNode newNode = new ListNode(l2.val);
              newNode.next = head.next;
              head.next = newNode;

              l2 = l2.next;
              cur = head.next;
              continue;
          }else if(l2.val>cur.val && cur.next ==null){
              ListNode newNode = new ListNode(l2.val);
              newNode.next = null;
              cur.next = newNode;

              l2 = l2.next;
              cur = head.next;
              continue;
          }
          cur = cur.next;

      }
    return head.next;
    }
}
