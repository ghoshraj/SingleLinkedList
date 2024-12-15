package singlelinkedlist;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;

public class RemoveDuplicate {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(90);
        list.add(90);
        list.add(50);
        list.add(50);
        list.add(20);
        list.add(20);
        list.add(80);
        list.add(80);
        Set<Integer>integers = new LinkedHashSet<>();
        for (int i = 0; i < list.size(); i++){
            integers.add(list.get(i));
        }
        System.out.println(integers);
        System.out.println("_________________");
        list.stream().distinct().forEach(i -> System.out.println(i));
    }
}
