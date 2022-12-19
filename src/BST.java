public class BST {

    protected class Node {
        public int data;
        public Node left, right, parent;

        public Node(int inData) {
            data = inData;
            left = right = parent = null;
        }

        public Node(int inData, Node inParent) {
            data = inData;
            parent = inParent;
            left = right = null;
        }
    }

    protected Node root;

    public BST() {
        root = null;
    }

    public BST(int inData){
        Node n = new Node(inData);
        root = n;
    }

    public int search(int value) {
        if (root == null){
            return 0;
        }
        return search(value, root);
    }

    private int search(int value, Node n){
        if (n.data == value){
            return 1;
        }
        else if (n.data > value){
            if (n.left == null){
                return 0;
            }
            return search(value, n.left);
        }
        else{
            if (n.right == null){
                return 0;
            }
            return search(value, n.right);
        }
    }

    public int Delete(int value) {
        return -1;
    }

    public void insert(int data) {
        // if first item to be inserted, it becomes the root
        if (root == null) {
            Node n = new Node(data);
            root = n;
        }
        insert(data, root);
    }

    private void insert(int data, Node n) {
        // recursively calls itself till it finds an empty node in proper place
        if (data < n.data){
            if (n.left == null){
                Node smaller = new Node(data, n);
                n.left = smaller;
            }
            else{
                insert(data, n.left);
            }
        }
        else if (data > n.data){
            if (n.right == null){
                Node larger = new Node(data, n);
                n.right = larger;
            }
            else{
                insert(data, n.right);
            }
        }
    }
}
