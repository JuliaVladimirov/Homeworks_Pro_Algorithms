package org.example.alg_homework_2024_04_29;

public class Run {

    public static void main(String[] args) {

        BinarySearchTree binaryTree = new BinarySearchTree();
        binaryTree.setRoot(new Node(13));
        binaryTree.getRoot().setLeft(new Node(5));
        binaryTree.getRoot().setRight(new Node(15));
        binaryTree.getRoot().getLeft().setLeft(new Node(6));
        binaryTree.getRoot().getLeft().setRight(new Node(3));
        // Сделала неправильное дерево

        binaryTree.getRoot().getRight().setLeft(new Node(17));
        binaryTree.getRoot().getRight().setRight(new Node(13));
        // Добавила еще два перепутанных узла с правой стороны

        binaryTree.print();
        // Проверила в консоли, действительно неправильное :)

        repairBinaryTree(binaryTree.getRoot());
        binaryTree.print();
        // Теперь правильно :)
    }

    public static void repairBinaryTree(Node parentNode) {

        Node leftChildNode = parentNode.getLeft();
        Node rightChildNode = parentNode.getRight();

        if (parentNode.getLeft() == null && parentNode.getRight() == null) {
            return;
        }
        if (leftChildNode.getValue() >= parentNode.getValue() && rightChildNode.getValue() < parentNode.getValue()) {
            parentNode.setLeft(rightChildNode);
            parentNode.setRight(leftChildNode);
        }

        if (parentNode.getLeft() != null) {
            repairBinaryTree(leftChildNode);
        }
        if (parentNode.getRight() != null) {
            repairBinaryTree(rightChildNode);
        }
    }
}
