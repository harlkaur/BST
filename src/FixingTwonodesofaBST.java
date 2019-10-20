import java.util.ArrayList;

public class FixingTwonodesofaBST {

	static Node root;
	public static void main(String[] args) {

	}

	public Node correctBST(Node root) {
		if (root == null)
			return root;
		ArrayList<Integer> list = new ArrayList<Integer>();
		addIntoArrayList(root, list);
		int count = 0;
		int k = -1;
		int temp = -1;
		// verify the swapped nodes in sorted array.
		for (int i = 0; i < list.size() - 1; i++) {
			if (list.get(i + 1) < list.get(i)) {
				if (count < 1) {
					temp = list.get(i);
					k = i;
					count++;
				} else {
					// swap the current node with temp variable
					int second = list.get(i);
					list.set(k, second);
					list.set(i, temp);
				}
			}
		}
		
		// insert the list into BST and return the BST
		for(int m =0;m<list.size();m++) {
			insert(list.get(m));
		}
		return root;
	}

	private static void addIntoArrayList(Node root, ArrayList<Integer> list) {
		if (root == null)
			return;
		addIntoArrayList(root.left, list);
		list.add(root.data);
		addIntoArrayList(root.right, list);
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
