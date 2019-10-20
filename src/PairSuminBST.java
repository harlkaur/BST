import java.util.ArrayList;

public class PairSuminBST {

	public static void main(String[] args) {

	}

	static boolean findPair(Node root, int sum) {

		// storing inorder result into arraylist
		ArrayList<Integer> list = addingIntoList(root);
		// verify if pair is present in sorted array or not;
		System.out.println(list.size());
		int j = list.size() - 1;
		int i = 0;
		while (i < j) {
			if (list.get(i) + list.get(j) == sum) {
				return true;
			} else if (list.get(i) + list.get(j) < sum) {
				i++;
			} else {
				j--;
			}
		}
		return false;
	}

	private static ArrayList<Integer> addingIntoList(Node root) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		if (root == null) {
			return list;
		}
		list = addingIntoList(root.left);
		list.add(root.data);
		list = addingIntoList(root.right);
		return list;
	}
}
