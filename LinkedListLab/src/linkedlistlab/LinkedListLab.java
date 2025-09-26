/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package linkedlistlab;

/**
 *
 * @author caryd
 */
public class LinkedListLab {
    public static void main(String[] args) {
        System.out.println("=== Singly Linked List ===");
        SinglyLinkedList sList = new SinglyLinkedList();
        sList.insertAtHead(10);
        sList.insertAtTail(20);
        sList.insertAtTail(30);
        System.out.print("Forward: ");
        sList.traverseForward();
        sList.deleteByValue(20);
        System.out.print("After deleting 20: ");
        sList.traverseForward();

        System.out.println("\n=== Doubly Linked List ===");
        DoublyLinkedList dList = new DoublyLinkedList();
        dList.insertAtHead(5);
        dList.insertAtTail(15);
        dList.insertAtTail(25);
        System.out.print("Forward: ");
        dList.traverseForward();
        System.out.print("Backward: ");
        dList.traverseBackward();
        dList.deleteByValue(15);
        System.out.print("After deleting 15 (forward): ");
        dList.traverseForward();
        System.out.print("After deleting 15 (backward): ");
        dList.traverseBackward();
    }
}

