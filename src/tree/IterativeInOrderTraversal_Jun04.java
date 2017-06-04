
import tree.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by polarbear on 6/4/17.
 */
public class IterativeInOrderTraversal_Jun04 {
    public static void main(String[] a) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(4);
        root.right = new TreeNode(8);
        root.right.left = new TreeNode(100);
        root.right.right = new TreeNode(11);


        IterativeInOrderTraversal_Jun04 myInOrder = new IterativeInOrderTraversal_Jun04();
        System.out.println(myInOrder.inOrder(root));


    }

    public List<Integer> inOrder(TreeNode root) {
        // Write your solution here.
        ArrayList<Integer> inOrder = new ArrayList<>();
        if(root == null) {
            return new ArrayList<Integer>();
        }

        TreeNode curr = root;
        ArrayDeque<TreeNode> stack = new ArrayDeque<>();

        while(curr != null || stack.size() > 0) {
            //reach the most-left node of the current node
            while(curr != null) {
                stack.push(curr);
                curr = curr.left;
            }

            //to check the next node after handling the current node
            if(curr == null && stack.size()>0) {
                TreeNode tmp = stack.pop();
                inOrder.add(tmp.key);
                curr = tmp.right;
            }
        }

        return inOrder;
    }



}
