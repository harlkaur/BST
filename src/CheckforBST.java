import java.util.ArrayList;

public class CheckforBST {

	public static void main(String[] args) {

		
	}
	
	private static int isBST(Node root)  
    {
		if(root == null)
			return 1;
		ArrayList<Integer> list = new ArrayList<Integer>();
		addIntoArrayList(root,list);
		
		// iterate and see if the elements in list are in sorted order or not ?
		for(int i=0;i<list.size()-1;i++) {
			if(list.get(i)>list.get(i+1)) {
				return 0;
			}
		}
		return 1;
    }

	private static void addIntoArrayList(Node root, ArrayList<Integer> list) {
		if(root == null)
            return;
		addIntoArrayList(root.left,list);
		list.add(root.data);
		addIntoArrayList(root.right,list);
	}

}
