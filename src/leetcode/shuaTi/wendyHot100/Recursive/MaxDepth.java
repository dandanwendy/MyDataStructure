package leetcode.shuaTi.wendyHot100.Recursive;

public class MaxDepth {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);

        root.left.left = new TreeNode(3);
        root.right.left = new TreeNode(4);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(3);

        System.out.println(maxDepth(root));
    }
    public static int maxDepth(TreeNode root) {
        //int depth = 0;
        if(root == null){
            return 0;
        }
       /* if(root.left==null && root.right==null){
            return 1;
        }*/
        return 1+Math.max(maxDepth(root.left),maxDepth(root.right));
    }
}
