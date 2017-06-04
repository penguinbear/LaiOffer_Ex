import tree.TreeNode;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by polarbear on 6/4/17.
 */
public class PreOrderTraversal_Jun04 {
    public static void main(String[] a) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(4);
        root.right = new TreeNode(8);
        root.right.right = new TreeNode(11);

        PreOrderTraversal_Jun04 myInOrder = new PreOrderTraversal_Jun04();
        System.out.println(myInOrder.preOrder(root));


    }

    public List<Integer> preOrder(TreeNode root) {
        // Write your solution here.
        if(root == null) {
            return new ArrayList<Integer>();
        }

        ArrayList<Integer> inOrder = new ArrayList<>();
        inOrder.add(Integer.valueOf(root.key));
        inOrder.addAll(preOrder(root.left));
        inOrder.addAll(preOrder(root.right));

        return inOrder;
    }



}
