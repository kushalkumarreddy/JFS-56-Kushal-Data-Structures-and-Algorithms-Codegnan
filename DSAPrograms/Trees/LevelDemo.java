
package DSAPrograms.Trees;

import java.util.LinkedList;
import java.util.Queue;

public class LevelDemo {

    public static void levelOrderTraversal(TreeNode root) {

        if (root == null) {
            return;
        }

        Queue<TreeNode> queueTreeNode = new LinkedList<>();

        queueTreeNode.add(root);

        while (!queueTreeNode.isEmpty()) {

            TreeNode current = queueTreeNode.poll();

            System.out.print(current.val + " ");

            if (current.left != null) {
                queueTreeNode.add(current.left);
            }

            if (current.right != null) {
                queueTreeNode.add(current.right);
            }
        }
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode('A');

        root.left = new TreeNode('B');
        root.right = new TreeNode('F');

        root.left.left = new TreeNode('C');

        root.left.left.left = new TreeNode('D');
        root.left.left.right = new TreeNode('E');

        root.right.right = new TreeNode('G');

        root.right.right.left = new TreeNode('H');
        root.right.right.right = new TreeNode('I');

        System.out.println("Level Order Traversal:");

        levelOrderTraversal(root);
    }
}
