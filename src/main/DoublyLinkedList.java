package main;

public class DoublyLinkedList<E> implements List{

    private Node<E> headNode;

    /**
     * Add a new value to the end of the list as a Node
     * @param element (element to add to the list)
     */
    @Override
    public void add(Object element) {
        Node<E> temp = headNode;
        Node<E> prev = headNode;

        if (headNode == null) {
            headNode = new Node<E>((E) element);
            return;
        }

        for (int i = 0; i < size(); i++) {
            prev = temp;
            temp = temp.getNextNode();
        }
        prev.setNextNode(new Node<E>((E) element));
    }

    /**
     * Add a new value to the specified index of the list as a Node
     * @param i       index of the element
     * @param element element to add to the list
     * @throws IndexOutOfBoundsException
     */
    @Override
    public void add(int i, Object element) throws IndexOutOfBoundsException {
        Node<E> temp = headNode;
        Node<E> prev = headNode;

        if (headNode == null) {
            headNode = new Node<E>((E) element);
            return;
        } else if (i < 0) {
            System.out.println("Cannot add node at a negative index: " + i);
            return;
        } else if (i == 0) {
            Node<E> thing = new Node<E>((E) element);
            thing.setNextNode(headNode);
            headNode.setPrevNode(thing);
            headNode = thing;
            return;
        }

        for (int x = 0; x < i; x++) {
            prev = temp;
            temp = temp.getNextNode();
        }
        Node<E> thing = new Node<E>((E) element);
        if (temp != null)
        {
            temp.setPrevNode(thing);
            thing.setNextNode(temp);
        }
        if (prev != null)
        {
            prev.setNextNode(thing);
            thing.setPrevNode(prev);
        }
    }

    /**
     * Remove every element from the doubly linked list
     */
    @Override
    public void remove() {
        //Iterate through whole list and remove connections
        Node<E> temp = headNode;
        Node<E> prev = headNode;
        for (int i = 0; i < size(); i++) {
            temp = temp.getNextNode();
            prev.setNextNode(null);
            temp.setPrevNode(null);
        }
        headNode = null;
    }

    /**
     * Remove the node at the specified index from the list
     * @param i index of the element to remove
     * @return node removed
     * @throws IndexOutOfBoundsException
     */
    @Override
    public Node<E> remove(int i) throws IndexOutOfBoundsException {
        Node<E> temp = headNode;
        Node<E> prev = headNode;

        if (i == 0)
        {
            temp = headNode.getNextNode();
            headNode = temp;
            headNode.setPrevNode(null);
        } else if (i < 0)
        {
            System.out.println("Cannot remove node from a negative index: " + i);
        }

        for (int x = 0; x < i; x++) {
            prev = temp;
            temp = temp.getNextNode();
        }


        prev.setNextNode(temp.getNextNode());
        if (temp.getNextNode() != null) {
            temp.getNextNode().setPrevNode(prev);
        }

        return temp;
    }

    /**
     * Get the node at the specified index in the list
     * @param i index of the element
     * @return node at specified index
     * @throws IndexOutOfBoundsException
     */
    @Override
    public Node<E> get(int i) throws IndexOutOfBoundsException {
        Node<E> temp = headNode;
        Node<E> prev = headNode;

        for (int x = 0; x < i; x++) {
            prev = temp;
            temp = temp.getNextNode();
        }

        return temp;
    }

    /**
     * Set the value of the node at the specified index in the list
     * @param i       index of the element to set
     * @param element new value of the element
     * @throws IndexOutOfBoundsException
     */
    @Override
    public void set(int i, Object element) throws IndexOutOfBoundsException {
        Node<E> temp = headNode;
        Node<E> prev = headNode;

        for (int x = 0; x < i; x++) {
            prev = temp;
            temp = temp.getNextNode();
        }

        System.out.println(temp);
        temp.setValue(element);
    }

    /**
     * Get the number of nodes/values in the list
     * @return # of nodes in list
     */
    @Override
    public int size() {
        Node<E> temp = headNode;
        int num = 1;
        if (headNode == null) {
            return 0;
        } else {
            while (temp.getNextNode() != null) {
                num++;
                temp = temp.getNextNode();
            }
            return num;
        }
    }

    /**
     * Check if there are any nodes in the list
     * @return true if headNode is null
     */
    @Override
    public boolean isEmpty() {
        return headNode == null;
    }

    /**
     * Get the values in the list as a single string
     * @return list as a string in format [_, _, _, _]
     */
    @Override
    public String toString() {
        Node<E> temp = headNode;
        String result = "[";

        if (headNode == null)
        {
            return "[]";
        }

        for (int i = 0; i < size(); i++) {
            result = result + temp.getValue() + ", ";
            temp = temp.getNextNode();
        }

        result = result.substring(0, result.length() - 2) + "]";
        return result;
    }
}
