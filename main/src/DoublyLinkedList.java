public class DoublyLinkedList<E> implements List{

    private Node<E> headNode;

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

    @Override
    public void add(int i, Object element) throws IndexOutOfBoundsException {
        Node<E> temp = headNode;
        Node<E> prev = headNode;

        if (headNode == null) {
            headNode = new Node<E>((E) element);
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
        Node<E> thing = new Node<E>((E) element, prev, temp);
        temp.setPrevNode(thing);
        prev.setNextNode(thing);
    }

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

    @Override
    public Node<E> remove(int i) throws IndexOutOfBoundsException {
        Node<E> temp = headNode;
        Node<E> prev = headNode;

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

    @Override
    public int size() {
        Node<E> temp = headNode;
        int num = 1;
        if (headNode.getValue() == null) {
            return 0;
        } else {
            while (temp.getNextNode() != null) {
                num++;
                temp = temp.getNextNode();
            }
            return num;
        }
    }

    @Override
    public boolean isEmpty() {
        return headNode == null;
    }

    @Override
    public String toString() {
        Node<E> temp = headNode;
        String result = "[";

        for (int i = 0; i < size(); i++) {
            result = result + temp.getValue() + ", ";
            temp = temp.getNextNode();
        }

        result = result.substring(0, result.length() - 2) + "]";
        return result;
    }
}
