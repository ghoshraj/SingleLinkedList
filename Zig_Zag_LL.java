package singlelinkedlist;

import java.util.LinkedList;

public class Zig_Zag_LL {

    public static int findmid(LinkedList<Integer>list){
        int slow = 0;
        int fast = 0;
        while (fast <= list.size() - 1 && fast <= list.size() - 2){
            slow++;
            fast+=2;
        }
        return slow;
    }
    public static LinkedList<Integer> ZigZag(LinkedList<Integer>list){
        if (list.size() < 2)
            return list;
        LinkedList<Integer>merged = new LinkedList<>();
        int mid = findmid(list);
        int n = list.size() - 1;
        for (int i = 0; i < mid; i++){
            merged.add(list.get(i));
            merged.add(list.get(n));
            n--;
        }
        return merged;
    }
    public static void main(String[] args) {
        LinkedList<Integer>list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        System.out.println(ZigZag(list));
    }
}
