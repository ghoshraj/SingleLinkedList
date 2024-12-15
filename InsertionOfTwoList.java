package singlelinkedlist;

import java.util.LinkedList;

public class InsertionOfTwoList {
    public static LinkedList<Integer>insertion(LinkedList<Integer>list,LinkedList<Integer>list1){
        LinkedList<Integer>merged = new LinkedList<>();
        for (int i = 0; i < list.size(); i++){
           if(list1.contains(list.get(i))) {
               merged.add(list.get(i));

           }
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
        list1.add(10);
        list1.add(40);
        list1.add(90);
        list1.add(60);
        list1.add(80);
        System.out.println(insertion(list,list1));
    }
}
