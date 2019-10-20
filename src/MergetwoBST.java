import java.util.ArrayList;

public class MergetwoBST {

	static ArrayList<Integer> list1 = new ArrayList<Integer>();
	static ArrayList<Integer> list2 = new ArrayList<Integer>();

	public static void main(String[] args) {

	}

	public static void merge(Node root1, Node root2) {
		if (root1 == null && root2 == null)
			return;
		list1.clear();
		list2.clear();
		
		// add both elements into arraylist and sort the list
		list1 = addingIntoList(root1, list1);
		list2 = addingIntoList(root2, list2);
		
		// sort both the list
		int i = 0, j = 0;
		while(i < list1.size() && j < list2.size()) {
			if (list1.get(i) <= list2.get(j)) {
				System.out.print(list1.get(i) + " ");
				i++;
			} else if (list1.get(i) > list2.get(j)) {
				System.out.print(list2.get(j) + " ");
				j++;
			}
		}
		while (i < list1.size()) {
			System.out.print(list1.get(i) + " ");
			i++;
		}
		while (j < list2.size()) {
			System.out.print(list2.get(j) + " ");
			j++;
		}
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
