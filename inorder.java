import java.util.*;

public class inorder {
    public static class Node {
        public int val;
        public Node right, left;
        public Node(int val) {
            this.val = val;
            right = left = null;
        }
    }
    public void inor(Node root) {
        if (root == null) return;
        inor(root.left);
        System.out.print(root.val + " ");
        inor(root.right);
    }
    public Node buildTree() {
        Node root = new Node(1);
        root.right = new Node(2);
        root.right.left = new Node(3);
        return root;
    }
    public static void main(String[] args) {
        inorder tree = new inorder();
        Node root = tree.buildTree();
        System.out.print("Inorder Traversal: ");
        tree.inor(root);
    }
}