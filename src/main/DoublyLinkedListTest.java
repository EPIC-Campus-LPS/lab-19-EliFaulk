package main;

class DoublyLinkedListTest {

    @org.junit.jupiter.api.Test
    void add() {
        main.DoublyLinkedList<Integer> test = new DoublyLinkedList<Integer>();
        test.add(2);
        test.add(3);
        test.add(-7);
        System.out.println(test);
    }

    @org.junit.jupiter.api.Test
    void testAdd() {
        main.DoublyLinkedList<Integer> test = new DoublyLinkedList<Integer>();
        test.add(2);
        test.add(-3);
        test.add(2,5);
        test.add(0, 9);
        test.add(1, 10);
        test.add(-1, 1);
        System.out.println(test);
    }

    @org.junit.jupiter.api.Test
    void remove() {
        main.DoublyLinkedList<Integer> test = new DoublyLinkedList<Integer>();
        test.add(2);
        test.add(4);
        test.add(-5);
        test.remove();
        test.add(-6);
        System.out.println(test);
    }

    @org.junit.jupiter.api.Test
    void testRemove() {
        main.DoublyLinkedList<Integer> test = new DoublyLinkedList<Integer>();
        test.add(3);
        test.add(-10);
        test.add(4);
        test.remove(1);
        test.add(50);
        test.add(60);
        test.remove(3);
        test.remove(0);
        System.out.println(test);
    }

    @org.junit.jupiter.api.Test
    void get() {
        main.DoublyLinkedList<Integer> test = new DoublyLinkedList<Integer>();
        test.add(3);
        test.add(6);
        test.add(9);
        System.out.println(test.get(0));
        System.out.println(test.get(1));
        System.out.println(test.get(2));
        test.remove(1);
        System.out.println(test.get(1));
    }

    @org.junit.jupiter.api.Test
    void set() {
        main.DoublyLinkedList<Integer> test = new DoublyLinkedList<Integer>();
        test.add(3);
        test.add(6);
        test.add(9);
        test.add(12);
        test.set(1, 20);
        test.set(0, 30);
        test.set(3, 500);
        System.out.println(test);
    }

    @org.junit.jupiter.api.Test
    void size() {
        main.DoublyLinkedList<Integer> test = new DoublyLinkedList<Integer>();
        for (int i = 0; i < 20; i++)
        {
            test.add(i);
        }
        System.out.println(test.size());
        test.remove();
        System.out.println(test.size());
    }

    @org.junit.jupiter.api.Test
    void isEmpty() {
        main.DoublyLinkedList<Integer> test = new DoublyLinkedList<Integer>();
        test.add(2);
        test.add(3);
        System.out.println(test.isEmpty());
        test.remove();
        System.out.println(test.isEmpty());
    }

    @org.junit.jupiter.api.Test
    void testToString() {
        main.DoublyLinkedList<Integer> test = new DoublyLinkedList<Integer>();
        test.add(5);
        test.add(70);
        test.add(60);
        test.add(2345);
        System.out.println(test);
        test.remove();
        System.out.println(test);
    }
}