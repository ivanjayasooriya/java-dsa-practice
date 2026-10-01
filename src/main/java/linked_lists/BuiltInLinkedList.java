package linked_lists;

import java.util.LinkedList;

public class BuiltInLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        int index = 5;
        list.add(index, 100);

        list.forEach(System.out::println);
    }
}
