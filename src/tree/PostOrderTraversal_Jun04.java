import tree.TreeNode;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by polarbear on 6/4/17.
 */
public class PostOrderTraversal_Jun04 {
    public static void main(String[] a) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(4);
        root.right = new TreeNode(8);
        root.right.right = new TreeNode(11);

        PostOrderTraversal_Jun04 myInOrder = new PostOrderTraversal_Jun04();
        System.out.println(myInOrder.postOrder(root));


    }

    public List<Integer> postOrder(TreeNode root) {
        // Write your solution here.
        if(root == null) {
            return new ArrayList<Integer>();
        }

        ArrayList<Integer> inOrder = new ArrayList<>();
        inOrder.addAll(postOrder(root.left));
        inOrder.addAll(postOrder(root.right));
        inOrder.add(Integer.valueOf(root.key));

        return inOrder;
    }



}
