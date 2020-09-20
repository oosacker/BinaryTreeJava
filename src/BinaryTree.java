public class BinaryTree {
    private Node root;

    public BinaryTree(int key) {
        this.root = new Node(key);
    }

    public BinaryTree() {
        this.root = null;
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public void addNode(int key) {
        Node newNode = new Node(key);
        if (this.root == null) {
            this.root = newNode;
        }
        else {
            Node current = this.root;
            Node parent;

            while(true) {

                parent = current;

                if(key < current.getKey()) {
                    current = current.getLeft();
                    if(current == null) {
                        parent.setLeft(newNode);
                        return;
                    }
                }

                else {
                    current = current.getRight();
                    if(current == null) {
                        parent.setRight(newNode);
                        return;
                    }
                }
            }
        }

    }

    public void inOrderTraversal(Node current) {
        if(current != null) {
            inOrderTraversal(current.getLeft());
            System.out.println(current.getKey());
            inOrderTraversal(current.getRight());
        }
    }

    public void findNode(int key) {

        Node current = this.getRoot();
        int count = 0;

        while(current.getKey() != key) {
            if (current.getKey() > key) {
                current = current.getLeft();
                System.out.println("Left");
            }
            else if (current.getKey() < key) {
                current = current.getRight();
                System.out.println("Right");
            }

            if(current == null) {
                System.out.println("Not found");
                return;
            }
            count++;
        }

        System.out.println("Found '"+key+ "' after "+count+" iterations");

    }


}
