package singlelinkedlist;

public class RemoveALoopInLL {
    public static void iscycle(Node first){
        Node slow = first;
        Node head = first;
        boolean cycle = false;
        while (head != null && head.next != null){
            slow = slow.next;
            first = first.next.next;
            if (slow == head){
                cycle = true;
                break;
            }
        }
        if (cycle == false)
            return ;

        slow = first;
        Node prev = null;
        while (slow != head){
            prev = head;
            slow = slow.next;
            head = head.next;
        }
        prev.next = null;
    }
    public static void main(String[] args) {
        Node first = new Node(10);
        first.next = new Node(20);
        first.next.next = new Node(30);
        first.next.next.next = new Node(40);
        first.next.next.next.next = first.next;
        iscycle(first);
    }
}
