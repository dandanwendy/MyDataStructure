package leetcode.shuaTi.wendyHot100.BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class PreorderTraversal {
    List<Integer> list = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root==null) return list;
        list.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
        return list;
    }
}
