package singlelinkedlist;

public class DetectingCycleInALL {
    public static boolean iscycle(Node first){
        Node slow = first;
        Node spped = first;

        while (spped != null && spped.next != null){
            slow = slow.next;
            spped = spped.next.next;
            if (slow == spped)
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Node first = new Node(10);
        first.next = new Node(20);
        first.next.next = new Node(30);
        first.next.next.next = new Node(40);
        first.next.next.next.next = first;
        System.out.println(iscycle(first));
    }
}
