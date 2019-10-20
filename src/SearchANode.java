
public class SearchANode {

	static Node root;

	public static void main(String[] args) {

	}

	boolean search(Node root, int x) {
		boolean left = false, right = false;
		if (root == null)
			return false;
		if (root.data == x)
			return true;
		if (x < root.data) {
			left = search(root.left, x);
		} else if (x > root.data) {
			right = search(root.right, x);
		}
		return left || right;
	}

}
