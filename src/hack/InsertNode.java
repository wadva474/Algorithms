package hack;

import java.util.Scanner;

/* This Code Provide Solution to the Question @here
https://www.hackerrank.com/challenges/insert-a-node-at-the-tail-of-a-linked-list/problem
 Author: MUSA ABDUL-WADUD OLAGOKE
*/
public class InsertNode {

    private static Node insertNode(Node node, int data) {
        Node newNode = new Node(data);
        newNode.next = null;

        if (node == null) {
            return newNode;
        }
        Node current = node;
        while (current.next != null) {
            current = current.next;
        }
        current.next = node;
        return current;

    }

    // This method Provides Solution for
    //https://www.hackerrank.com/challenges/insert-a-node-at-the-head-of-a-linked-list/problem?h_r=next-challenge&h_v=zen
    private static Node insertNodeAtHead(Node node, int data) {
        Node newNode = new Node(data);
        node.next = newNode;
        return newNode;
    }

    //This method Provides solution for (Printing Elements in a Linked List)
    //https://www.hackerrank.com/challenges/print-the-elements-of-a-linked-list/problem
    private static void printLinkedList(Node node) {
        System.out.println(node.data);
        Node currentNode = node.next;
        while (currentNode != null) {
            System.out.println(currentNode.data);
            currentNode = currentNode.next;
        }

    }

    //This method Provides solution for (Inserting an Element in a Linked List at a particular position )
    //https://www.hackerrank.com/challenges/insert-a-node-at-a-specific-position-in-a-linked-list/problem?h_r=next-challenge&h_v=zen
    private static Node insertNodeAtPosition(Node head, int data, int position) {
        Node newNode = new Node(data);
        Node currentNode = head;
        while (position > 1) {
            currentNode = currentNode.next;
            position--;
        }
        if (currentNode.next != null) {
            Node previous = currentNode.next;
            currentNode.next = newNode;
            newNode.next = previous;
        } else {
            currentNode.next = newNode;
            newNode.next = null;
        }
        return head;
    }

    //This method Provides solution for (Deleting an element at a position in a LinkedList)
    //https://www.hackerrank.com/challenges/delete-a-node-from-a-linked-list/problem?h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen
    private static Node deleteNode(Node head, int position) {
        Node beforeDeleteNode = head;
        Node toBeDeleted = null;
        if (position == 0) {
            return head.next;
        }
        while (position > 0) {
            toBeDeleted = beforeDeleteNode;
            beforeDeleteNode = toBeDeleted.next;
            position--;
        }
        assert toBeDeleted != null;
        toBeDeleted.next = beforeDeleteNode.next;
        return head;
    }

    //This method Provides solution for (reverse a linked list)
    //https://www.hackerrank.com/challenges/reverse-a-linked-list/problem
    private static Node reverseALinkedList(Node head) {
        Node previous = null;
        Node currentNode = head;
        Node next;
        while (currentNode != null) {
            next = currentNode.next;
            currentNode.next = previous;
            previous = currentNode;
            currentNode = next;
        }
        head = previous;
        return head;
    }

    //https://www.hackerrank.com/challenges/compare-two-linked-lists/problem?h_r=next-challenge&h_v=zen
    private static boolean compareList(Node head1, Node head2) {
        Node list1 = head1;
        Node list2 = head2;
        while (list1 != null && list2 != null) {
            if (list1.data != list2.data) {
                return false;
            }
            list1 = list1.next;
            list2 = list2.next;
        }
        return (list1 == null && list2 == null);
    }


    static class Node {
        Node head;

        public Node(int data) {
            this.data = data;
        }

        int data;
        Node next;
    }


}


