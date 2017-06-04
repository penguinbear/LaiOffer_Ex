import tree.TreeNode;

import java.util.ArrayList;


/**
 * Created by polarbear on 6/4/17.
 */
public class IsBalanced_Jun04 {
    public static void main(String[] a) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(4);
        //root.right = new TreeNode(8);
        //root.right.right = new TreeNode(11);

        IsBalanced_Jun04 myInOrder = new IsBalanced_Jun04();
        System.out.println(myInOrder.getHeight(root));
        System.out.println(myInOrder.isBalanced(root));


    }

    public boolean isBalanced(TreeNode root) {
        // Write your solution here.
        if(root == null) {
            return true;
        }

        if(Math.abs(getHeight(root.left) - getHeight(root.right)) > 1) {
            return false;
        }

        return isBalanced(root.left) && isBalanced(root.right);
    }

    public int getHeight(TreeNode root) {
        // Write your solution here.
        if(root == null) {
            return 0;
        }
        return 1 + Math.max(getHeight(root.left),getHeight(root.right));
    }

}
