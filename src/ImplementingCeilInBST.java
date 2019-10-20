
public class ImplementingCeilInBST {

	public static void main(String[] args) {

	}

	private static int findCeil(Node root, int key) {
		if (root == null)
			return -1;
		if (root.data == key)
			return root.data;
		else if (root.data < key)
			return findCeil(root.right, key);
		else {
			int value = findCeil(root.left, key);
			return (value >= key) ? value : root.data;
		}
	}
}
