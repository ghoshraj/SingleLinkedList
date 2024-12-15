package singlelinkedlist;

public class ReverseALinkedList {
    public static void reverse(Node first){
        Node prev = null;
        Node curr = first;
        Node next = null;
        while (curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node temp = prev;
        while (temp != null){
            System.out.println(temp.ele);
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        Node first = new Node(10);
        first.next = new Node(20);
        first.next.next = new Node(30);
        first.next.next.next = new Node(40);
        reverse(first);
    }
}
