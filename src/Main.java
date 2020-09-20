public class Main {

    public static void main(String[] args) {
	    BinaryTree b = new BinaryTree(3);

	    b.addNode(5);
        b.addNode(6);
        b.addNode(7);
        b.addNode(8);
        b.addNode(13);

        b.inOrderTraversal(b.getRoot());
        b.findNode(6);
    }
}
