package singlelinkedlist;

import java.util.LinkedList;

public class DeleteN_NodeAfterMNodes {
    public static void finallist(LinkedList<Integer>list ,int n,int m){
        int i = 0;
        while (i < list.size()){
            i+=m;
            int temp = n;
            while (temp > 0 && i < list.size()){
                list.remove(i);
                temp--;
            }
        }
    }
    public static void main(String[] args) {
        LinkedList<Integer>list = new LinkedList<>();
        list.add(19);
        list.add(9);
        list.add(59);
        list.add(10);
        list.add(11);
        list.add(22);
        list.add(20);
        list.add(1);
        int n = 2;
        int m = 4;
        finallist(list,n,m);
        System.out.println(list);
    }
}
