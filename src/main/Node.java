package main;

public class Node<E> {
    private E value;
    private Node<E> previous;
    private Node<E> next;

    public Node(E val) {
        value = val;
    }

    public Node(E val, Node<E> prev) {
        value = val;
        previous = prev;
    }

    public Node(E val, Node<E> prev, Node<E> nex) {
        value = val;
        previous = prev;
        next = nex;
    }

    public E getValue() {
        return value;
    }

    public void setValue(Object v) {
        value = ((E) v);
    }

    public void setPrevNode(Node<E> node) {
        previous = node;
    }

    public Node<E> getPrevNode() {
        return previous;
    }

    public void setNextNode(Node<E> node) {
        next = node;
    }

    public Node<E> getNextNode() {
        return next;
    }


    @Override
    public String toString() {
        return String.valueOf(value);
    }


    public boolean equals(Node<E> node) {
        return node.getValue() == value;
    }
}
