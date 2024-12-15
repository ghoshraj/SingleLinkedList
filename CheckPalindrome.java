package singlelinkedlist;

public class CheckPalindrome {
    public static Node findmid(Node first){
        Node slow = first;
        Node fast = first;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public static boolean isPalindrome(Node first){
        //base case
        if (first == null || first.next == null)
            return true;

        //step -1 : Find mid
        Node midnode = findmid(first);

        //step - 2 : Reverse
        Node prev = null;
        Node curr = midnode;
        Node next;
        while (curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right = prev;
        Node left = first;

        //step - 3 : check first half and second half
        while (right != null){
            if (right.ele != left.ele)
                return false;
            left = left.next;
            right = right.next;
        }
        return true;
    }
    public static void main(String[] args) {
        Node first = new Node(10);
//        first.next = new Node(10);
//        first.next.next = new Node(10);
//        first.next.next.next = new Node(10);
        System.out.println(isPalindrome(first));
    }
}
