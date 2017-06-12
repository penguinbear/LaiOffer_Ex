import tree.TreeNode;


/**
 * Created by polarbear on 6/4/17.
 */
public class IsBalanced_Jun07 {
    public static void main(String[] a) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(4);
        //root.right = new TreeNode(8);
        //root.right.right = new TreeNode(11);

        IsBalanced_Jun07 myInOrder = new IsBalanced_Jun07();
        System.out.println(myInOrder.getHeight(root));
        System.out.println(myInOrder.isBalanced(root));


    }

    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }

        return Math.abs(getHeight(root.left) - getHeight(root.right)) < 2 && isBalanced(root.left) && isBalanced(root.right);
    }

    public int getHeight(TreeNode root) {
        if (root == null) {
            return 0;
        }

        return 1 + Math.max(getHeight(root.left), getHeight(root.right));
    }

}
