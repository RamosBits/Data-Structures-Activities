/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linkedlistlab;

/**
 *
 * @author caryd
 */

class SinglyNode {
    int data;
    SinglyNode next;

    SinglyNode(int value) {
        data = value;
        next = null;
    }
}

class SinglyLinkedList {
    SinglyNode head;

    void insertAtHead(int value) {
        SinglyNode newNode = new SinglyNode(value);
        newNode.next = head;
        head = newNode;
    }

    void insertAtTail(int value) {
        SinglyNode newNode = new SinglyNode(value);
        if (head == null) {
            head = newNode;
            return;
        }
        SinglyNode temp = head;
        while (temp.next != null) temp = temp.next;
        temp.next = newNode;
    }

    void deleteByValue(int value) {
        if (head == null) return;
        if (head.data == value) {
            head = head.next;
            return;
        }
        SinglyNode temp = head;
        while (temp.next != null && temp.next.data != value) {
            temp = temp.next;
        }
        if (temp.next != null) {
            temp.next = temp.next.next;
        }
    }

    void traverseForward() {
        SinglyNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

