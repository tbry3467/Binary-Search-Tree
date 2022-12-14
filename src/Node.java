class Node {
    public int data;
    public Node left, right, parent;

    public Node(int inData){
        data = inData;
        left = right = parent = null;
    }
    public Node(int inData, Node inParent){
        data = inData;
        parent = inParent;
        left = right = null;
    }

}
