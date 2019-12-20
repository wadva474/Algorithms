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
    private static Node insertNodeAtHead(Node node, int data){
        Node newNode = new Node(data);
        node.next = newNode;
        return newNode;
    }

    static class Node {
        public Node(int data) {
            this.data = data;
        }

        int data;
        Node next;
    }


}


