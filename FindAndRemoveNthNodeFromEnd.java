package singlelinkedlist;

public class FindAndRemoveNthNodeFromEnd {
    public static void remove(Node first ,int a){
        //find the size
        int size = 0;
        Node temp = first;
        while (temp != null){
            temp = temp.next;
            size++;
        }
        //if first index
        if (size == a){
            first = first.next;
            return;
        }
        //find proprer index and remove
        int i = 1;
        int index = size - a;
        Node cuur = first;
        while (i < index){
            i++;
            cuur = cuur.next;
        }
        cuur.next = cuur.next.next;

        //print the linkedlist
        while (first != null){
            System.out.println(first.ele);
            first = first.next;
        }
    }

    public static void main(String[] args) {
        Node first = new Node(10);
        first.next = new Node(20);
        first.next.next = new Node(30);
        first.next.next.next = new Node(40);
        int index = 2;
        remove(first,index);
    }
}
