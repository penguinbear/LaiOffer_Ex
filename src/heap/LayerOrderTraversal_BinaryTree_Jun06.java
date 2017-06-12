package heap;

import tree.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * Created by polarbear on 6/4/17.
 */
public class LayerOrderTraversal_BinaryTree_Jun06 {

    public static void main(String[] a) {
        tree.TreeNode root = null;
        LayerOrderTraversal_BinaryTree_Jun06 myLayerOrder = new LayerOrderTraversal_BinaryTree_Jun06();
        System.out.println(myLayerOrder.layerByLayer(root));

        root = new TreeNode(100);

        root.left = new tree.TreeNode(3);
        root.left.left = new tree.TreeNode(1);
        root.left.right = new tree.TreeNode(4);
        root.right = new tree.TreeNode(8);
        root.right.right = new tree.TreeNode(11);

        System.out.println(myLayerOrder.layerByLayer(root));


    }


    public List<List<Integer>> layerByLayer(TreeNode root) {
        // Write your solution here.
        if (root == null) {
            return new ArrayList();
        }

        List<List<Integer>> layers = new ArrayList<>();
        Queue<TreeNode> queue = new ArrayDeque<>();

        queue.offer(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> layer = new ArrayList<>();
            for (int i = 0; i < size ; i++) {
                TreeNode node = queue.poll();
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
                layer.add(node.key);
            }

            layers.add(layer);
        }
        return layers;
    }


}

