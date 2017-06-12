import tree.TreeNode;


/**
 * Created by polarbear on 6/4/17.
 */
public class IsBinarySearchTree_Jun07 {
    public static void main(String[] a) {
        /*
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right = new TreeNode(8);
        root.right.left = new TreeNode(6);

        root.right.right = new TreeNode(11);
        */
        TreeNode root = new TreeNode(6);
        root.left = new TreeNode(4);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(5);
        root.right = new TreeNode(10);
        root.right.left = new TreeNode(6);

        root.right.right = new TreeNode(12);


        IsBinarySearchTree_Jun07 myInOrder = new IsBinarySearchTree_Jun07();
        System.out.println(myInOrder.isBST(root));


    }

    public boolean isBST(TreeNode root) {
        return isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public boolean isBST(TreeNode root, int lower_bound, int upper_bound) {
        if (root == null) {
            return true;
        }
        if (root.key < lower_bound || root.key > upper_bound) {
            return false;
        }
        return isBST(root.left, lower_bound, root.key) && isBST(root.right, root.key, upper_bound);
    }

}
