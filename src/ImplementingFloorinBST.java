
public class ImplementingFloorinBST {

	public static void main(String[] args) {

		
	}
	
	private static int floor(Node root, int key) { 
        if(root == null) {
        	return Integer.MAX_VALUE;
        }
        if(root.data == key)
        	return root.data;
        else if(root.data > key)
        	return floor(root.left,key);
        else {
        	int value = floor(root.right,key);
        	return (value <= key)? value:root.data;
        }
    } 

}
