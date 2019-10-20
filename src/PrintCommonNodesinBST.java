
public class PrintCommonNodesinBST {

	static Node root;
	static Node root1;
	static Node root2;

	public static void main(String[] args) {
		PrintCommonNodesinBST tree = new PrintCommonNodesinBST();
		PrintCommonNodesinBST tree1 = new PrintCommonNodesinBST();
		tree.insert(50);
		tree.insert(30);
		tree.insert(20);
		tree.insert(40);
		tree.insert(70);
		tree.insert(60);
		tree.insert(80);

		tree1.insert(50);
		tree1.insert(30);
		tree1.insert(20);
		tree.printCommon(root1, root2);
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

	public void printCommon(Node root1, Node root2) {
		if (root1 == null || root2 == null)
			return;
		printCommon(root1.left, root2);
		// search every node of first tree into second tree
		checkIfSame(root1.data, root2);
		printCommon(root1.right, root2);
	}

	private void checkIfSame(int data, Node root2) {
		if (root2 == null)
			return;
		if (data == root2.data)
			System.out.print(data + " ");
		checkIfSame(data, root2.left);
		checkIfSame(data, root2.right);
	}
}
