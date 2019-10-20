
public class PrintBSTelementsingivenrange {

	public static void main(String[] args) {

		
	}

	void printNearNodes(Node node, int k1, int k2)
    {
		if(node == null) {
			return;
		}
		
		printNearNodes(node.left,k1,k2);
		if((node.data >= k1) && (node.data <= k2)) {
			System.out.print(node.data + " ");
		}
		printNearNodes(node.right,k1,k2);
    }
}
