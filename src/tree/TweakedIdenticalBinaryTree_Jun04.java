import tree.TreeNode;


/**
 * Created by polarbear on 6/4/17.
 */
public class TweakedIdenticalBinaryTree_Jun04 {
    public static void main(String[] a) {
        TreeNode root_1 = new TreeNode(5);
/*        root_1.left = new TreeNode(3);
        root_1.left.left = new TreeNode(1);
        root_1.left.right = new TreeNode(4);*/
        root_1.right = new TreeNode(3);
        root_1.right.left = new TreeNode(4);
        root_1.right.right = new TreeNode(1);


        TreeNode root_2 = new TreeNode(5);
        root_2.left = new TreeNode(3);
        root_2.left.left = new TreeNode(1);
        root_2.left.right = new TreeNode(4);
/*        root_2.right = new TreeNode(3);
        root_2.right.left = new TreeNode(4);
        root_2.right.right = new TreeNode(1);*/

        TweakedIdenticalBinaryTree_Jun04 myInOrder = new TweakedIdenticalBinaryTree_Jun04();
        //System.out.println(myInOrder.getHeight(root_1));
        System.out.println(myInOrder.isTweakedIdentical(root_1, root_2));


    }


    public boolean isTweakedIdentical(TreeNode tree_1, TreeNode tree_2) {
        if(tree_1 == null && tree_2 == null) {
            return true;
        }

        if(tree_1 == null || tree_2 == null) {
            return false;
        }

        if(tree_1.key != tree_2.key) {
            return false;
        }

        return (isTweakedIdentical(tree_1.left, tree_2.left) && isTweakedIdentical(tree_1.right, tree_2.right)
                || (isTweakedIdentical(tree_1.left, tree_2.right) && isTweakedIdentical(tree_1.right, tree_2.left)));

    }


}
