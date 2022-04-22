package com.sparta.sortmanager.sorters.binarytree;

public class Tree {
    private Node node;

    public Tree(int value) {
        node = new Node(value);
    }

    public Node getNode() {
        return node;
    }

    public void setNode(Node node) {
        this.node = node;
    }

    public Node insert(Node node, int valueToInsert) {
        if (node == null) {
            return new Node(valueToInsert);
        }

        if (valueToInsert < node.getValue()) {
            node.setLeftNode(insert(node.getLeftNode(), valueToInsert));
        }

        if (valueToInsert > node.getValue()) {
            node.setRightNode(insert(node.getRightNode(), valueToInsert));
        }

        return node;
    }

    public int traversingInOrder(Node node, int[] arrayToFill, int index) {
        if (node.getLeftNode() != null) {
            index = traversingInOrder(node.getLeftNode(), arrayToFill, index);
        }
        arrayToFill[index++] = node.getValue();

        if (node.getRightNode() != null) {
            index = traversingInOrder(node.getRightNode(), arrayToFill, index);
        }

        return index;
    }
}
