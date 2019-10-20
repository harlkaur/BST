import java.util.LinkedList;
import java.util.Queue;

public class ConvertLevelOrderTraversaltoBST {

	public static void main(String[] args) {

	}

	public Node constructBST(int[] arr) {
		int n = arr.length;
		if (n == 0) {
			return null;
		}
		Node root = null;
		for (int i = 0; i < n; i++) {
			root = levelOrder(root, arr[i]);
		}
		
		return root;
	}

	private Node levelOrder(Node root, int i) {
		if (root == null) {
			root = getNode(i);
			return root;
		}
		if (i <= root.data) {
			root.left = levelOrder(root.left, i);
		} else {
			root.right = levelOrder(root.right, i);
		}
		return root;
	}

	private Node getNode(int data) {
		Node newNode = new Node(data);
		newNode.left = null;
		newNode.right = null;
		return newNode;
	}
}
