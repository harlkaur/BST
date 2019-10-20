
public class DeleteANode {

	static Node root;
	public static void main(String[] args) {
		DeleteANode tree = new DeleteANode();
		
	}

	Node deleteNode(Node root, int key) 
    {
		if(root == null)
			return root;
		if(key < root.data)
			root.left = deleteNode(root.left,key);
		else if(key > root.data)
			root.right = deleteNode(root.right,key);
		else {
			if(root.left == null)
				return root.right;
			else if(root.right == null)
				return root.left;
			
			root.data = minValue(root.right);
			
			root.right = deleteNode(root.right,root.data);
		}
		return root;
    }

	private int minValue(Node root) {
		int min = root.data;
		while(root.left!=null) {
			min = root.left.data;
			root = root.left;
		}
		return min;
	}
}
