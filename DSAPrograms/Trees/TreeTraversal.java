package DSAPrograms.Trees;

public class TreeTraversal {
	public static void inOrder(TreeNode root) {
		
		if(root == null) {
			return;
		}
		
		inOrder(root.left);
		System.out.print(root.val+"->");
		inOrder(root.right);
	}
	
	public static void preOrder(TreeNode root) {
		
		if(root == null) {
			return;
		}
		
		System.out.print(root.val+"->");
		preOrder(root.left);
		preOrder(root.right);
	}
	
	public static void postOrder(TreeNode root) {
		
		if(root == null) {
			return;
		}
		
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.val+"->");
	}


	
	public static void main(String[] args) {
		
		TreeNode root = new TreeNode(2);
		
		root.left = new TreeNode(4);
		root.right = new TreeNode(6);
		
		root.left.left = new TreeNode(7);
		root.left.right = new TreeNode(6);
		
		root.right.left = new TreeNode(5);
		
		root.right.left.left = new TreeNode(6);
		root.right.left.right = new TreeNode(6);
		
		System.out.println("======== InOrder Traversal ============");
		inOrder(root);
		System.out.println();
		System.out.println("======== PreOrder Traversal ============");
		preOrder(root);
		System.out.println();
		System.out.println("======== PostOrder Traversal ============");
		postOrder(root);
	}

}
