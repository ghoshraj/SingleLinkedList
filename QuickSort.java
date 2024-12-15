package singlelinkedlist;

import java.util.LinkedList;

public class QuickSort {
    private static int partion(LinkedList<Integer> list, int low , int high){
        int pivot = list.get(high);
        int i = low - 1;
        for (int j = low; j < high; j++){
            if (list.get(j) < pivot){
                i++;
                int temp = list.get(i);
                list.set(i,list.get(j));
                list.set(j,temp);
            }
        }
        int temp = list.get(i + 1);
        list.set(i + 1,list.get(high));
        list.set(high,temp);
        return i + 1;
    }
    public static void quicksort(LinkedList<Integer> list, int low , int high){
        if (low < high){
            int pi = partion(list,low,high);
            quicksort(list,low,pi - 1);
            quicksort(list, pi + 1,high);
        }
    }
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(90);
        list.add(50);
        list.add(20);
        list.add(80);
        quicksort(list,0,list.size() - 1);
        System.out.println(list);
    }
}
