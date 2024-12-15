package singlelinkedlist;

import java.util.LinkedList;

public class SearchEle {
    public static boolean isPresent(LinkedList<Integer>list , int key){
        for (int i = 0; i < list.size(); i++){
            if (list.get(i) == key)
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList<>();
        list.add(10);
        list.add(30);
        list.add(20);
        list.add(60);
        list.add(40);
        int key = 80;
        System.out.println(isPresent(list , key));
    }
}
