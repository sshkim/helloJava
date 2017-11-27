package main.com.sshkim.dataStructure.tree;

/**
 * Created by sshkim on 2016. 12. 13..
 */

public class BinaryTree {

    private int data;
    private BinaryTree left;
    private BinaryTree right;

    public BinaryTree(int data) {
        this.data = data;
    }

    public BinaryTree(int data, BinaryTree left, BinaryTree right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public BinaryTree getLeft() {
        return left;
    }

    public void setLeft(BinaryTree left) {
        this.left = left;
    }

    public BinaryTree getRight() {
        return right;
    }

    public void setRight(BinaryTree right) {
        this.right = right;
    }

    public boolean isLeaf() {
        return (left == null && right == null);
    }

    public static boolean findInBT(BinaryTree tree, int data) {
        if (tree.getData() == data)
            return true;

        if (findInBT(tree.getLeft(), data) || findInBT(tree.getRight(), data)) {
            return true;
        } else {
            return false;
        }

    }


}
