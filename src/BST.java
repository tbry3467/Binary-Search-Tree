public class BST {

    class Node {
        public int data;
        public Node left, right, parent;

        protected Node(int inData) {
            data = inData;
            left = right = parent = null;
        }

        protected Node(int inData, Node inParent) {
            data = inData;
            parent = inParent;
            left = right = null;
        }
    }
    protected Node root;
    public BST() {
        root = null;
    }
    public int Search(int value) {
        return -1;
    }
    public int Delete(int value) {
        return -1;
    }
    public int Insert(int value) {
        return 1;
    }
}
