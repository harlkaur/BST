import java.util.ArrayList;

public class FindtheClosestElementinBST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int maxDiff(Node root, int k) {
		if (root == null)
			return 1;
		ArrayList<Integer> list = new ArrayList<Integer>();
		addIntoArrayList(root, list);

		// iterate and see for the closest element
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) == k) {
				return 0;
			} else if (min > (Math.abs(list.get(i) - k))) {
				min = Math.abs(list.get(i) - k);
			}
		}
		return min;
	}

	private static void addIntoArrayList(Node root, ArrayList<Integer> list) {
		if (root == null)
			return;
		addIntoArrayList(root.left, list);
		list.add(root.data);
		addIntoArrayList(root.right, list);
	}
}
