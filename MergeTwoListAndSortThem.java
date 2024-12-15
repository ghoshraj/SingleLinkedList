package singlelinkedlist;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class MergeTwoListAndSortThem {
    public static void main(String[] args) {
        LinkedList<Integer>list = new LinkedList<>();
        list.add(10);
        list.add(90);
        list.add(50);
        list.add(20);
        list.add(80);
        LinkedList<Integer>list1 = new LinkedList<>();
        list1.add(70);
        list1.add(40);
        list1.add(100);
        list1.add(60);
        list1.add(30);
        list.addAll(list1);
        list.stream().sorted(Comparator.reverseOrder()).forEach(i -> System.out.println(i));
        System.out.println("_____________________");
        Collections.sort(list);
        System.out.println(list);
    }
}
