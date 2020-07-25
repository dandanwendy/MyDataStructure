package leetcode.shuaTi.wendyHot100.List;

import java.util.HashMap;

public class CopyRandomList {
    public Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }
        HashMap<Node, Node> map = new HashMap<>();
        Node h = head;
        Node cur = new Node(-1); //空结点，dummy 节点，为了方便头结点计算
        while (h != null) {
            //判断当前节点是否已经产生过
            if (!map.containsKey(h)) {
                Node t = new Node(h.val);
                map.put(h, t);
            }
            //得到当前节点去更新它的 random 指针
            Node next = map.get(h);
            if (h.random != null) {
                //判断当前节点是否已经产生过
                if (!map.containsKey(h.random)) {
                    next.random = new Node(h.random.val);
                    map.put(h.random, next.random);
                } else {
                    next.random = map.get(h.random);
                }

            }
            //将当前生成的节点接到 cur 的后边
            cur.next = next;
            cur = cur.next;
            h = h.next;
        }
        return map.get(head);
    }
}

class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}