package Singly_Linked_List_Impl;

/**
 * Generic singly linked list data structure class.
 */
public class SinglyLinkedList<T> {

    private class Node {
        T data;
        Node next;

        Node(T val) {
            data = val;
            next = null;
        }
    }

    private Node head;
    private Node tail;
    private int count;

    /**
     * Default Constructor
     */
    SinglyLinkedList() {
        count = 0;
        head = null;
        tail = null;
    }

    /**`
     * Constructor
     * @param data - First value to be placed at head.
     */
    SinglyLinkedList(T val) {
        count = 1;
        Node newNode = new Node(val);
        head = newNode;
        tail = newNode;
    }

    /**
     * Inserts the passed data at the head of the list.
     * @param data - Data to be inserted.
     */
    public void insertAtHead(T val) {
        Node newNode = new Node(val);
        
        if(head == null) {
            head = newNode;
        } else {
            Node temp = head;
            head = newNode;
            head.next = temp;
        }

        count++;
    }

    /**
     * Inserts the passed data at the tail of the list.
     * @param data - Data to be inserted.
     */
    public void insertAtTail(T val) {
        Node newNode = new Node(val);
        tail.next = newNode;
        tail = tail.next;
        count++;
    }

    /**
     * Removes the first occurance of the passed data.
     * @param data - Data to be removed.
     */
    public boolean remove(T data) {
        Node it = head;
        Node prev = null;

        while(it != null) {

            if(it.data == data) {

                if(it == head) {
                    head = it.next;
                } else if(it == tail) {
                    prev.next = null;
                    tail = prev;
                    break;
                } else {
                    prev.next = it.next;
                }
                count--;
                return true;
            }
            prev = it;
            it = it.next;
        }

        return false;
    }

    /**
     * Removes all occurances of the passed data.
     * @param data - Data to be removed.
     */
    public boolean removeAll(T data) {
        Node it = head;
        Node prev = null;
        boolean flag = false;

        while(it != null) {

            if(it.data == data) {

                if(it == head) {
                    head = it.next;
                    it = head;
                } else if(it == tail) {
                    prev.next = null;
                    tail = prev;
                    break;
                } else {
                    prev.next = it.next;
                    it = it.next;
                }

                count--;
                flag = true;
                continue;
            }

            prev = it;
            it = it.next;
        }

        return flag;
    }

    /**
     * Clears the list and all member variables.
     */
    public void clearList() {
        head = null;
        tail = null;
        count = 0;
    }

    /**
     * Gets the number of nodes in the list.
     */
    public int getSize() {
        return count;
    }

    /**
     * Gets the value of the head node.
     */
    public T getHead() {
        return head.data;
    }

    /**
     * Gets the value of the tail node.
     */
    public T getTail() {
        return tail.data;
    }

    /**
     * Gets the value of the tail node.
     */
    public void printList() {
        System.out.print("Singly Linked List: ");
        Node it = head;

        while(it != tail) {
            System.out.print(" " + it.data + " ->");
            it = it.next;
        }
        System.out.println(" " + tail.data);
    }
}