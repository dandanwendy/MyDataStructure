package leetcode.shuaTi.wendyHot100.BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class InorderTraversal {
    List<Integer> list = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root==null) return list;
        inorderTraversal(root.left);
        list.add(root.val);
        inorderTraversal(root.right);
        return list;
    }
}
