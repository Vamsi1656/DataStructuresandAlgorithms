package com.BST;


class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

class BSTree {
    Node root;

    public BSTree() {
        root = null;
    }

    void insert(int data) {
        root = insertRec(root, data);
    }

    Node insertRec(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }

        if (data < root.data) {
            root.left = insertRec(root.left, data);
        } else if (data > root.data) {
            root.right = insertRec(root.right, data);
        }

        return root;
    }

    void inOrder(Node root) {
        if (root != null) {
            inOrder(root.left);
            System.out.println(root.data);
            inOrder(root.right);
        }
    }
}

public class BinarySearchTree {
    public static void main(String[] args) {
        BSTree tree = new BSTree();

        int[] data = {5, 3, 8, 2, 4, 11};

        for (int i : data) {
            tree.insert(i);
        }

        tree.inOrder(tree.root);
    }
}


