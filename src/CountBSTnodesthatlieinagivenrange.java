import java.util.ArrayList;

public class CountBSTnodesthatlieinagivenrange {

	static ArrayList<Integer> list = new ArrayList<Integer>();

	public static void main(String[] args) {

	}

	public static int getCountOfNode(Node root, int l, int h) {
		if (root == null)
			return 0;
		list.clear();
		list = addingIntoList(root, list);
		int count = 0;
		for (int i = 0; i < list.size(); i++) {
			if ((list.get(i) >= l) && (list.get(i) <= h)) {
				count++;
			}
		}
		return count;
	}

	private static ArrayList<Integer> addingIntoList(Node root, ArrayList<Integer> list) {
		if (root == null) {
			return list;
		}
		list = addingIntoList(root.left, list);
		list.add(root.data);
		list = addingIntoList(root.right, list);
		return list;
	}
}
