package singlelinkedlist;

public class Implement_Single_LL {
    public static void main(String[] args) {
        Imp s = new Imp();
        s.add(10);
        s.add(20);
        s.add(30);
        s.add(40);
        s.remove(2);
        s.add(50,1);
        System.out.println("size of the single linkedlist is : " +s.size());
        for (int i = 0; i < s.size(); i++){
            System.out.println(s.get(i));
        }
    }

    static class Imp {

        private int count = 0;
        private Node first = null;

        public int size() {
            return count;
        }

        public void add(Object e) {
            if (first == null) {
                first = new Node(e, null);
                count++;
                return;
            }
            Node curr = first;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = new Node(e, null);
            count++;
        }

        public void add(Object e, int index) {
            if (index <= -1 || index >= size())
                throw new IndexOutOfBoundsException();
            if (index == 0) {
                first = new Node(e, first);
                count++;
                return;
            }
            Node curr = first;
            for (int i = 1; i < index; i++) {
                curr = curr.next;
            }
            curr.next = new Node(e, curr.next);
            count++;
        }

        public Object get(int index) {
            if (index <= -1 || index >= size())
                throw new IndexOutOfBoundsException();
            Node curr = first;
            for (int i = 0; i < index; i++) {
                curr = curr.next;
            }
            return curr.ele;
        }

        public void remove(int index) {
            if (index <= -1 || index >= size())
                throw new IndexOutOfBoundsException();
            if (index == 0) {
                first = first.next;
                count--;
                return;
            }
            Node curr = first;
            for (int i = 1; i < index; i++) {
                curr = curr.next;
            }
            curr.next = curr.next.next;
            count--;
        }
    }
}
