import tree.TreeNode;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by polarbear on 6/4/17.
 */
public class RangeInBinarySearchTree_Jun07 {
    public static void main(String[] a) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right = new TreeNode(8);
        root.right.left = new TreeNode(6);

        root.right.right = new TreeNode(11);

        RangeInBinarySearchTree_Jun07 myRanger = new RangeInBinarySearchTree_Jun07();
        System.out.println(myRanger.getRange(root, -11, -12));


    }

    public List<Integer> getRange(TreeNode root, int min, int max) {
        List<Integer> keys = new ArrayList<>();
        if (root == null) {
            return keys;
        }

            keys.addAll(getRange(root.left, min, root.key));
        if (root.key >= min && root.key <= max) {
            keys.add(root.key);
        }
            keys.addAll(getRange(root.right, root.key, max));

        return keys;
    }


}
