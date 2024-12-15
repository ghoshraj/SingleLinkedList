package singlelinkedlist;

class Node {
    Object ele;
    Node next;

    Node(Object e, Node n) {
        ele = e;
        next = n;
    }

    Node(Object e) {
        ele = e;
        next = null;
    }
}