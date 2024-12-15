package singlelinkedlist;

import java.util.LinkedList;

public class AlternateMergedLinkedList {
    public static LinkedList<Integer>alternatemerge(LinkedList<Integer>list,LinkedList<Integer>list1){
        LinkedList<Integer>merged = new LinkedList<>();
        int i = 0;
        int j = 0;
        while (i < list.size() && j < list1.size()){
            merged.add(list.get(i));
            merged.add(list1.get(j));
            i++;
            j++;
        }
        while (i < list.size()){
            merged.add(list.get(i));
            i++;
        }
        while (j < list.size()){
            merged.add(list.get(j));
        }
        return merged;
    }
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
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
        System.out.println(alternatemerge(list,list1));
    }
}
