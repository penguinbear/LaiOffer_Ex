
import tree.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by polarbear on 6/4/17.
 */
public class IterativePreOrderTraversal_Jun04 {
    public static void main(String[] a) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(4);
        root.right = new TreeNode(8);
        root.right.left = new TreeNode(100);
        root.right.right = new TreeNode(11);


        IterativePreOrderTraversal_Jun04 myPreOrder = new IterativePreOrderTraversal_Jun04();
        System.out.println(myPreOrder.preOrder(root));


    }

    public List<Integer> preOrder(TreeNode root) {
        // Write your solution here.
        ArrayList<Integer> preOrder = new ArrayList<>();
        if(root == null) {
            return new ArrayList<Integer>();
        }

        ArrayDeque<TreeNode> stack = new ArrayDeque<>();
        stack.push(root);

        while(stack.size() > 0) {
            TreeNode tmp = stack.pop();
            preOrder.add(tmp.key);
            if(tmp.right != null) {
                stack.push(tmp.right);
            }
            if(tmp.left != null) {
                stack.push(tmp.left);
            }

        }

        return preOrder;
    }



}
