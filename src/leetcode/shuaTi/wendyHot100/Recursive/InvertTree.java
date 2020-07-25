package leetcode.shuaTi.wendyHot100.Recursive;

public class InvertTree {
    public TreeNode invertTree(TreeNode root) {
        if(root==null) return root;
        if(root.left==null && root.right==null) return root;
        TreeNode node = root.left;
        root.left = root.right;
        root.right = node;

        invertTree(root.left);
        invertTree(root.right);

        return root;
    }
}
