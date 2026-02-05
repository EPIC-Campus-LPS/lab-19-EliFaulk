package main;

public class Node<E> {
    private E value;
    private Node<E> previous;
    private Node<E> next;

    /**
     * Creates an instance of Node
     * @param val (the value that the Node will store)
     */
    public Node(E val) {
        value = val;
    }

    /**
     * Creates an instance of Node
     * @param val (the value that the Node will store)
     * @param prev (the previous Node in the list)
     */
    public Node(E val, Node<E> prev) {
        value = val;
        previous = prev;
    }

    /**
     * Creates an instance of Node
     * @param val (the value that the Node will store)
     * @param prev (the previous Node in the list)
     * @param nex (the next Node in the list)
     */
    public Node(E val, Node<E> prev, Node<E> nex) {
        value = val;
        previous = prev;
        next = nex;
    }

    /**
     * Gets the value of the Node
     * @return (value of the Node)
     */
    public E getValue() {
        return value;
    }

    /**
     * Changes the value of the Node
     * @param v (the new value of the Node)
     */
    public void setValue(Object v) {
        value = ((E) v);
    }

    /**
     * Changes the previous Node
     * @param node (new previous Node)
     */
    public void setPrevNode(Node<E> node) {
        previous = node;
    }

    /**
     * Gets the previous Node
     * @return (previous Node)
     */
    public Node<E> getPrevNode() {
        return previous;
    }

    /**
     * Changes the next Node
     * @param node (new next Node)
     */
    public void setNextNode(Node<E> node) {
        next = node;
    }

    /**
     * Gets the next Node
     * @return (next Node)
     */
    public Node<E> getNextNode() {
        return next;
    }


    /**
     * Print the value of the Node
     * @return (value as a string)
     */
    @Override
    public String toString() {
        return String.valueOf(value);
    }


    /**
     * Checks is this node's value is equal to another node's value)
     * @param node (the node to compare to)
     * @return (true if values are equal)
     */
    public boolean equals(Node<E> node) {
        return node.getValue() == value;
    }
}
