package singlelinkedlist;

import java.util.LinkedList;

public class BubbleSort {
    public static void bubblesort(LinkedList<Integer>list){
        int n = list.size();
        for (int i = 0; i < n - 1; i ++){
            for (int j = 0; j < n - 1 - i; j++){
                if (list.get(j) > list.get(j + 1)){
                    int temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1,temp);
                }
            }
        }
    }
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(90);
        list.add(50);
        list.add(20);
        list.add(80);
        bubblesort(list);
        System.out.println(list);
    }
}
