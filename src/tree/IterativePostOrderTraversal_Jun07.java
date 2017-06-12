import tree.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;


/**
 * Created by polarbear on 6/4/17.
 */
public class IterativePostOrderTraversal_Jun07 {
    public static void main(String[] a) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        /*
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(4);
        root.right = new TreeNode(8);
        root.right.left = new TreeNode(100);
        */
        //root.right.right = new TreeNode(11);


        IterativePostOrderTraversal_Jun07 myPreOrder = new IterativePostOrderTraversal_Jun07();
        System.out.println(myPreOrder.postOrder(root));


    }

    public List<Integer> postOrder(TreeNode root) {
        // Write your solution here.
        List<Integer> postOrder = new ArrayList<>();
        if(root == null) {
            return new ArrayList<Integer>();
        }

        Deque<TreeNode> stack = new ArrayDeque<>();

        stack.push(root);
        TreeNode prev = root;


        while(stack.size() > 0) {
            TreeNode curr = stack.peek();
            if(curr.left == null && curr.right == null
                    || curr.right == prev
                    || curr.left == prev) {
                prev = stack.pop();
                postOrder.add(prev.key);
            } else {
                if (curr.right != null) {
                    stack.push(curr.right);
                }
                if (curr.left != null) {
                    stack.push(curr.left);
                }

            }
        }

        return postOrder;
    }



}
