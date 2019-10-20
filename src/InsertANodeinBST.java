
public class InsertANodeinBST {

	static Node root;

	public static void main(String[] args) {
		InsertANodeinBST tree = new InsertANodeinBST();

		/*
		 * Let us create following BST 50 / \ 30 70 / \ / \ 20 40 60 80
		 */
		tree.insert(50);
		tree.insert(30);
		tree.insert(20);
		tree.insert(40);
		tree.insert(70);
		tree.insert(60);
		tree.insert(80);
		tree.inOrder(root);
	}

	private void inOrder(Node root) {
		if (root == null)
			return;
		inOrder(root.left);
		System.out.print(root.data + " ");
		inOrder(root.right);
	}

	void insert(int data) {
		root = insertNode(root, data);
	}

	Node insertNode(Node root, int data) {
		if (root == null) {
			Node temp = new Node(data);
			return temp;
		}
		if (data < root.data) {
			root.left = insertNode(root.left, data);
		} else if (data > root.data) {
			root.right = insertNode(root.right, data);
		}
		return root;
	}
}

class Node {
	int data;
	Node left, right;

	Node(int key) {
		this.data = key;
		left = right = null;
	}
}