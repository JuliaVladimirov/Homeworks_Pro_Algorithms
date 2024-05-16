package org.example.alg_homework_2024_04_29;



public class BinarySearchTree {

    private Node root;

    public Node getRoot() {
        return root;
    }
    public void setRoot(Node root) {
        this.root = root;
    }

    public void print() {
        System.out.println(root);
    }

//    public void insert(int item) {
//        Node newNode = new Node(item);
//        if (root == null) {
//            root = newNode;
//        } else {
//            Node current = root;
//            Node previous;
//            while (true) {
//                previous = current;
//                if (item < current.getValue()) {
//                    current = current.getLeft();
//                    if (current == null) {
//                        previous.setLeft(newNode);
//                        return;
//                    }
//                } else {
//                    current = current.getRight();
//                    if (current == null) {
//                        previous.setRight(newNode);
//                        return;
//                    }
//                }
//            }
//        }
//    }
//
//    public Node find(int item) {
//        if (root == null) {
//            System.out.println("Список пуст");
//            return null;
//        }
//        Node current = root;
//        while (current.getValue() != item) {
//            if (item < current.getValue())
//                current = current.getLeft();// Идем влево если искомый элемент меньше текущего значения
//            else
//                current = current.getRight();//  Идем вправо если искомый элемент больше текущего значения
//            if (current == null) {
//                System.out.println("Искомое значение " + item + " не найдено");
//                return null;
//            }
//        }
//        return current;
//    }
//
//    Node deleteNode(Node root, int item) {
//
//        if (root == null) {// базовое условие
//            return root;
//        }
//
//        if (item < root.getValue()) { // если удаляемое значение меньше чем значение в корневом узле, то идем влево
//            root.setLeft(deleteNode(root.getLeft(), item));
//
//        } else if (item > root.getValue()) { // если удаляемое значение больше чем значение в корневом узле, то идем вправо
//            root.setRight(deleteNode(root.getRight(), item));
//
//        } else { // если значение равно значению в корневом узле, то это тот узел, который надо удалять
//
//// Узел с одним дочерним узлом или вообще без дочерних узлов
//            if (root.getLeft() == null) {
//                return root.getRight();
//            } else if (root.getRight() == null) {
//                return root.getLeft();
//            }
//
//// Узел с двумя дочерними узлами: то удаляемый узел нужно заменить самым минимальным по значению в его правом поддереве
//            root.setValue(minValue(root.getRight()));
//
//            root.setRight(deleteNode(root.getRight(), root.getValue()));
//        }
//        return root;
//    }
//
//    int minValue(Node root) {
//        int minValue = root.getValue();
//        while (root.getLeft() != null) {
//            minValue = root.getLeft().getValue();
//            root = root.getLeft();
//        }
//        return minValue;
//    }



}
