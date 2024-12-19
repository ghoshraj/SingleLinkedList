package singlelinkedlist;

import java.util.LinkedList;

public class SwappingNodeInLL {
    static class myexception extends RuntimeException {
        myexception(String msg) {
            super(msg);
        }
    }
    public static void swap(LinkedList<Integer>list,int n , int m) throws myexception{
        if (n <= -1 || m <= -1 || n >= list.size() || m >= list.size())
            throw new myexception("add proper index value");
        int temp = list.get(n);
        list.set(n,list.get(m));
        list.set(m,temp);
    }
    public static void main(String[] args) {
        LinkedList<Integer>list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(1);
        list.add(11);
        list.add(21);
        list.add(13);
        list.add(12);
        int n = -1;
        int m = 4;
        swap(list,n,m);
        System.out.println(list);
    }
}
