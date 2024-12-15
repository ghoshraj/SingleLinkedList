package singlelinkedlist;

import java.util.LinkedList;

public class SelectionSort {
    public static void selectionsort(LinkedList<Integer>list){
        int n = list.size();
        for (int i = 0; i < n - 1; i++){
            int loc = i;
            for (int j = i +1 ; j < n; j++){
                if (list.get(j)<list.get(loc))
                    loc = j;
            }
            if (loc != i){
                int temp = list.get(i);
                list.set(i,list.get(loc));
                list.set(loc,temp);
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
        selectionsort(list);
        System.out.println(list);
    }
}
