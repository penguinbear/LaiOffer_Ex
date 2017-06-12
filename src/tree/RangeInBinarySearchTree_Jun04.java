import tree.TreeNode;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by polarbear on 6/4/17.
 */
public class RangeInBinarySearchTree_Jun04 {
    public static void main(String[] a) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right = new TreeNode(8);
        root.right.left = new TreeNode(6);

        root.right.right = new TreeNode(11);

        RangeInBinarySearchTree_Jun04 myRanger = new RangeInBinarySearchTree_Jun04();
        System.out.println(myRanger.getRange(root, -11, -12));


    }

    public List<Integer> getRange(TreeNode root, int min, int max) {
        // Write your solution here.
        ArrayList<Integer> result = new ArrayList<>();
        if(root == null) {
            return result;
        }


        result.addAll(getRange(root.left, min, max));

        if(root.key >= min && root.key <= max) {
            result.add(root.key);
        }

        result.addAll(getRange(root.right, min, max));




        return result;
    }


}
