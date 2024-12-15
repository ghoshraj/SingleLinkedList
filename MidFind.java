package singlelinkedlist;

public class MidFind {
    public static Node findmid(Node first){
        Node slow = first;
        Node fast = first;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public static void main(String[] args) {
        Node first = new Node(10);
        first.next = new Node(20);
        first.next.next = new Node(30);
        first.next.next.next = new Node(40);
        System.out.println(findmid(first));
    }
}
