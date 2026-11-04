
package DSAPrograms;

public class TreeTraversalExample {

    // TreeNode class inside TreeTraversalExample
    static class TreeNode {
        char val;
        TreeNode left, right;

        TreeNode(char val) {
            this.val = val;
        }
    }

    // InOrder: Left -> Root -> Right
    public static void inOrder(TreeNode root) {
        if (root == null) {
            return;
        }

        inOrder(root.left);
        System.out.print(root.val + "->");
        inOrder(root.right);
    }

    // PreOrder: Root -> Left -> Right
    public static void preOrder(TreeNode root) {
        if (root == null) {
            return;
        }

        System.out.print(root.val + "->");
        preOrder(root.left);
        preOrder(root.right);
    }

    // PostOrder: Left -> Right -> Root
    public static void postOrder(TreeNode root) {
        if (root == null) {
            return;
        }

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val + "->");
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

        System.out.println("======== InOrder Traversal ========");
        inOrder(root);
        System.out.println();

        System.out.println("======== PreOrder Traversal ========");
        preOrder(root);
        System.out.println();

        System.out.println("======== PostOrder Traversal ========");
        postOrder(root);
        System.out.println();
    }
}
