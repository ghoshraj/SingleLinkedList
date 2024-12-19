package singlelinkedlist;

import java.util.LinkedList;

public class OddEvenLinkedList {
    public static void findevenodd(LinkedList<Integer>list){
        LinkedList<Integer>even = new LinkedList<>();
        LinkedList<Integer>odd = new LinkedList<>();
        for (int i = 0; i < list.size(); i++){
            if (list.get(i) % 2 == 0)
                even.add(list.get(i));
            else
                odd.add(list.get(i));
        }
        LinkedList<Integer>finallist = new LinkedList<>(even);
        finallist.addAll(odd);
    }
    public static void main(String[] args) {
        LinkedList<Integer>list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(11);
        list.add(21);
        list.add(33);
        findevenodd(list);
        System.out.println(list);
    }
}
