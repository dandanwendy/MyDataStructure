package leetcode.shuaTi.wendyHot100.BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LevelOrder {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);

        root.left.left = new TreeNode(3);
        root.right.left = new TreeNode(4);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(3);

        System.out.println(levelOrder(root));

    }
    public static List<List<Integer>> levelOrder(TreeNode root) {
        // 结果集
        List result = new ArrayList();
        // 待遍历的层级节点列表
        LinkedList<TreeNode> list = new LinkedList();
        if (root != null) list.add(root);
        int size = list.size();
        while (size > 0) {
            // 创建保存当前层序的结果集列表
            List item = new ArrayList();
            // 遍历当前层序，加入结果集及获取下一层级的节点
            for (int i = 0; i < size; i++) {
                TreeNode node = list.remove();
                System.out.println(node.val);
                item.add(node.val);
                if (node.left != null) list.add(node.left);
                if (node.right != null) list.add(node.right);
            }
            size = list.size();
            result.add(item);
        }
        return result;
    }
}
