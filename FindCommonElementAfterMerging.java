package singlelinkedlist;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class FindCommonElementAfterMerging {
    public static LinkedList<Integer>findcommonelement(LinkedList<Integer>list,LinkedList<Integer>list1){
        LinkedList<Integer>merged = new LinkedList<>(list);
        merged.addAll(list1);

        Set<Integer>commonelement = new HashSet<>();
        Set<Integer>s = new HashSet<>();
        for (int i = 0; i < merged.size(); i++){
            if (s.contains(merged.get(i)))
                commonelement.add(merged.get(i));
            else
                s.add(merged.get(i));
        }
        return new LinkedList<>(commonelement);
    }
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(90);
        list.add(50);
        list.add(20);
        list.add(80);
        LinkedList<Integer>list1 = new LinkedList<>();
        list1.add(10);
        list1.add(40);
        list1.add(90);
        list1.add(60);
        list1.add(80);
        System.out.println(findcommonelement(list,list1));
    }
}
