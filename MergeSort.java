package singlelinkedlist;

import java.util.LinkedList;

public class MergeSort {
    public static LinkedList<Integer> mergesort(LinkedList<Integer> list){
        if (list.size() <= 1)
            return list;
        LinkedList<Integer>left = new LinkedList<>();
        LinkedList<Integer>right = new LinkedList<>();

        int mid = list.size()/2;
        for (int i = 0; i < mid; i++){
            left.add(list.get(i));
        }
        for (int i = mid; i < list.size(); i++){
            right.add(list.get(i));
        }
       left = mergesort(left);
       right = mergesort(right);

        return merge(left,right);
    }
    private static LinkedList<Integer> merge(LinkedList<Integer> left , LinkedList<Integer> right){
        LinkedList<Integer>merged = new LinkedList<>();
        int i = 0;
        int j = 0;
        while (i < left.size() && j < left.size()){
            if (left.get(i) <= right.get(i)) {
                merged.add(left.get(i));
                i++;
            }
            else {
                merged.add(right.get(j));
                        j++;
            }
        }
        while (i < left.size()){
            merged.add(left.get(i));
            i++;
        }
        while (j < right.size()){
            merged.add(right.get(j));
            j++;
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
        System.out.println(mergesort(list));
    }
}
