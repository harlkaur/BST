
public class MinValueInBST {

	static Node root;
	public static void main(String[] args) {
		MinValueInBST tree = new MinValueInBST();
		tree.insert(50);
		tree.insert(30);
		tree.insert(20);
		tree.insert(40);
		tree.insert(70);
		tree.insert(60);
		tree.insert(80);
		tree.inOrder(root);
		int value = tree.minValue(root);
		System.out.println("min value: " + value);
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
	
	int minValue(Node root)
    {
        if(root == null)
        	return -1;
        if(root.left == null) {
        	return root.data;
        }else
        	return minValue(root.left);
    }
}
