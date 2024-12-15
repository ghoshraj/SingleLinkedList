package singlelinkedlist;

import java.util.LinkedList;

public class InsertionSort {
    public static void insertionsort(LinkedList<Integer>list){
        int n = list.size();
        for (int i = 1; i < list.size(); i++){
            int temp = list.get(i);
            int j = i - 1;
            while (j >= 0 && temp < list.get(j)){
                list.set(j + 1,list.get(j));
                j--;
            }
            list.set(j+1,temp);
        }
    }
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(90);
        list.add(50);
        list.add(20);
        list.add(80);
        insertionsort(list);
        System.out.println(list);
    }
}
