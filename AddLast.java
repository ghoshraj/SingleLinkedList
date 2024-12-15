package singlelinkedlist;

import java.util.LinkedList;

public class AddLast {
    public static void addLast(LinkedList<Integer>list,int ele){
       list.addLast(ele);
    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList<>();
        list.add(10);
        list.add(30);
        list.add(20);
        list.add(60);
        list.add(40);
        int ele = 80;
        addLast(list,ele);
        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
