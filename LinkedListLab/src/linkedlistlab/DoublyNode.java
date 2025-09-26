/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linkedlistlab;

/**
 *
 * @author caryd
 */
class DoublyNode {
    int data;
    DoublyNode next, prev;

    DoublyNode(int value) {
        data = value;
        next = null;
        prev = null;
    }
}

class DoublyLinkedList {
    DoublyNode head;

    void insertAtHead(int value) {
        DoublyNode newNode = new DoublyNode(value);
        if (head != null) {
            newNode.next = head;
            head.prev = newNode;
        }
        head = newNode;
    }

    void insertAtTail(int value) {
        DoublyNode newNode = new DoublyNode(value);
        if (head == null) {
            head = newNode;
            return;
        }
        DoublyNode temp = head;
        while (temp.next != null) temp = temp.next;
        temp.next = newNode;
        newNode.prev = temp;
    }

    void deleteByValue(int value) {
        if (head == null) return;

        if (head.data == value) {
            head = head.next;
            if (head != null) head.prev = null;
            return;
        }

        DoublyNode temp = head;
        while (temp != null && temp.data != value) {
            temp = temp.next;
        }

        if (temp != null) {
            if (temp.next != null) temp.next.prev = temp.prev;
            if (temp.prev != null) temp.prev.next = temp.next;
        }
    }

    void traverseForward() {
        DoublyNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            if (temp.next == null) break;
            temp = temp.next;
        }
        System.out.println();
    }

    void traverseBackward() {
        if (head == null) return;

        DoublyNode temp = head;
        while (temp.next != null) temp = temp.next;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
        System.out.println();
    }
}
