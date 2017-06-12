import tree.TreeNode;


/**
 * Created by polarbear on 6/4/17.
 */
public class SymmetricBinaryTree_Jun07 {
    public static void main(String[] a) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(4);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(1);

        //root.right = new TreeNode(8);
        //root.right.right = new TreeNode(11);

        SymmetricBinaryTree_Jun07 myInOrder = new SymmetricBinaryTree_Jun07();
        //System.out.println(myInOrder.getHeight(root));
        System.out.println(myInOrder.isSymmetric(root));


    }

    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return isSymmetric(root.left, root.right);

    }

    private boolean isSymmetric(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }
        /*
        if (left != null && right == null
                ||
                left == null && right != null)
                */
        if (left == null || right == null) {
            return false;
        }

        if(left.key != right.key) {
            return false;
        }
        return isSymmetric(left.left, right.right) && isSymmetric(left.right, right.left);

    }


}
