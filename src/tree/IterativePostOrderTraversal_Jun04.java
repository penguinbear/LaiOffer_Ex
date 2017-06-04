
import tree.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by polarbear on 6/4/17.
 */
public class IterativePostOrderTraversal_Jun04 {
    public static void main(String[] a) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(4);
        root.right = new TreeNode(8);
        root.right.left = new TreeNode(100);
        root.right.right = new TreeNode(11);


        IterativePostOrderTraversal_Jun04 myPreOrder = new IterativePostOrderTraversal_Jun04();
        System.out.println(myPreOrder.postOrder(root));


    }

    public List<Integer> postOrder(TreeNode root) {
        // Write your solution here.
        ArrayList<Integer> postOrder = new ArrayList<>();
        if(root == null) {
            return new ArrayList<Integer>();
        }

        ArrayDeque<TreeNode> stack = new ArrayDeque<>();

        if(root.right != null) {
            stack.push(root.right);
        }
        stack.push(root);
        TreeNode curr = root.left;


        while(stack.size() > 0) {
            while(curr != null) {
                if(curr.right != null) {
                    stack.push(curr.right);
                }
                stack.push(curr);
                curr = curr.left;

            }
            curr = stack.pop();
            if(curr.right != null && stack.peek() == curr.right) {
                stack.pop();
                stack.push(curr);
                curr = curr.right;
            } else {
                postOrder.add(curr.key);
                curr = null;
            }

        }

        return postOrder;
    }



}
