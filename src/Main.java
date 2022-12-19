public class Main {
    public static void main(String[] args){
        BST tree = new BST();
        tree.insert(3);
        tree.insert(2);

        System.out.println(tree.search(3));
        System.out.println(tree.search(2));
        System.out.println(tree.search(1));
    }
}
