package leetcode.shuaTi.wendyHot100.BinarySearchTree;

import java.util.ArrayList;
import java.util.List;

public class IsValidBST {
    List<Integer> list = new ArrayList<>();
    public boolean isValidBST(TreeNode root) {
        if(root==null) return true;
        List<Integer> list1 = inorderTraversal(root);

        int a = list1.get(0);
        for(int i=1;i<list1.size();i++){
            if(list1.get(i)<=a){
                return false;
            }
            a = list1.get(i);
        }
       return true;
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        if(root==null) return list;
        inorderTraversal(root.left);
        list.add(root.val);
        inorderTraversal(root.right);
        return list;
    }
}
