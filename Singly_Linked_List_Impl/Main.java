package Singly_Linked_List_Impl;

/**
 * Main driver class to demonstrate singly linked list.
 */
public class Main {
    public static void main(String args[]) {
        stringExample();
        System.out.println(" ");
        integerExample();
    }

    /**
     * Example of singly linked list using strings.
     */
    public static void stringExample() {
        System.out.println("Singly Linked List String Example.");

        SinglyLinkedList<String> singlyLinkedList = new SinglyLinkedList<String>("1");

        singlyLinkedList.insertAtHead("2");
        singlyLinkedList.insertAtHead("3");
        singlyLinkedList.insertAtHead("4");
        singlyLinkedList.insertAtTail("5");
        singlyLinkedList.insertAtTail("6");
        singlyLinkedList.printList();

        singlyLinkedList.remove("4");
        singlyLinkedList.printList();
        singlyLinkedList.remove("2");
        singlyLinkedList.printList();
        singlyLinkedList.remove("6");
        singlyLinkedList.printList();

        singlyLinkedList.insertAtHead("7");
        singlyLinkedList.insertAtHead("8");
        singlyLinkedList.insertAtHead("7");
        singlyLinkedList.insertAtTail("7");
        singlyLinkedList.printList();
        
        singlyLinkedList.removeAll("7");
        singlyLinkedList.printList();

        System.out.println("Head: " + singlyLinkedList.getHead());
        System.out.println("Tail: " + singlyLinkedList.getTail());
    }

    /**
     * Example of singly linked list using integers.
     */
    public static void integerExample() {
        System.out.println("Singly Linked List Integer Example.");

        SinglyLinkedList<Integer> singlyLinkedList = new SinglyLinkedList<Integer>(1);

        singlyLinkedList.insertAtHead(2);
        singlyLinkedList.insertAtHead(3);
        singlyLinkedList.insertAtHead(4);
        singlyLinkedList.insertAtTail(5);
        singlyLinkedList.insertAtTail(6);
        singlyLinkedList.printList();

        singlyLinkedList.remove(4);
        singlyLinkedList.printList();
        singlyLinkedList.remove(2);
        singlyLinkedList.printList();
        singlyLinkedList.remove(6);
        singlyLinkedList.printList();

        singlyLinkedList.insertAtHead(7);
        singlyLinkedList.insertAtHead(8);
        singlyLinkedList.insertAtHead(7);
        singlyLinkedList.insertAtTail(7);
        singlyLinkedList.printList();
        
        singlyLinkedList.removeAll(7);
        singlyLinkedList.printList();

        System.out.println("Head: " + singlyLinkedList.getHead());
        System.out.println("Tail: " + singlyLinkedList.getTail());
    }
}
