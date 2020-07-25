package leetcode.shuaTi.wendyHot100.BinaryTree;

public class IsBalanced {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.left.left = new TreeNode(4);

        root.right = new TreeNode(2);
        root.right.right = new TreeNode(3);
        root.right.right.right = new TreeNode(4);

        System.out.println(isBalanced(root));

    }
    public static boolean isBalanced(TreeNode root) {
        return treeHeight(root)!=-1;
    }

    public  static int treeHeight(TreeNode root){
        int lheight = 0;
        int rheight = 0;
        if(root == null) return 0;

        int a = treeHeight(root.left);
        int b = treeHeight(root.right);
        if(a==-1 || b==-1){
            lheight=-1;
            rheight=-1;
        }else{
            lheight = 1+a;
            rheight = 1+b;
        }

        if(lheight==-1 || rheight==-1 || Math.abs(lheight-rheight)>1){
            return -1;
        }
        else{
            return Math.max(lheight,rheight);
        }
    }

    //下面代码可以实现平衡二叉树的判断
    /*public static boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        return treeHeight(root)!=-1 && isBalanced(root.left) && isBalanced(root.right);
    }

    public  static int treeHeight(TreeNode root){
        int lheight = 0;
        int rheight = 0;
        if(root == null) return 0;

        lheight = 1+treeHeight(root.left);
        rheight = 1+treeHeight(root.right);

        if(lheight==-1 || rheight==-1){
            return -1;
        }else if(Math.abs(lheight-rheight)>1){
            return -1;
        }
        else{
            return Math.max(lheight,rheight);
        }
    }*/
}
