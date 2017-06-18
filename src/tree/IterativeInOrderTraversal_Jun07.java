import tree.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;


/**
 * Created by polarbear on 6/4/17.
 */
public class IterativeInOrderTraversal_Jun07 {
    public static void main(String[] a) {

        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(4);
        root.right = new TreeNode(8);
        root.right.left = new TreeNode(100);
        root.right.right = new TreeNode(11);

        //TreeNode root = null;

        IterativeInOrderTraversal_Jun07 myInOrder = new IterativeInOrderTraversal_Jun07();
        System.out.println(myInOrder.inOrder(root));


    }

    public List<Integer> inOrder(TreeNode root) {
        // Write your solution here.
        List<Integer> inOrder = new ArrayList<>();

        if(root == null) {
            return inOrder;
        }

        Deque<TreeNode> stack = new ArrayDeque<>();
        TreeNode curr = root;
        stack.push(root);

        while(stack.size() > 0) {
            if (curr.left != null) {
                stack.push(curr.left);
                curr = curr.left;
            } else {
                curr = stack.pop();
                inOrder.add(curr.key);

                if (curr.right != null) {
                    stack.push(curr.right);
                    curr = curr.right;
                }
            }
        }

        return inOrder;
    }

    /*
    public List<Integer> inOrder(TreeNode root) {
        // Write your solution here.
        List<Integer> inOrder = new ArrayList<>();

        if(root == null) {
            return inOrder;
        }

        Deque<TreeNode> stack = new ArrayDeque<>();
        //TreeNode curr = root;
        stack.push(root);

        while(stack.size() > 0) {
            if (stack.peek().left != null) {
                stack.push(root.left);
                //curr = curr.left;
            } else {
                curr = stack.pop();
                inOrder.add(curr.key);

                if (curr.right != null) {
                    stack.push(curr.right);
                    curr = curr.right;
                }
            }
        }

        return inOrder;
    }
    */

}
