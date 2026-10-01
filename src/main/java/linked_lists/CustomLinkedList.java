package linked_lists;

public class CustomLinkedList {
    public static void main(String[] args) {
        Node<Integer> head = new Node<>(0, null);

        Node<Integer> current = head;

        for (int i = 1; i < 10; i++) {
            current.next = new Node<>(i, null);
            current = current.next;
        }

        current = head;

        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }

        System.out.println();

        current = head;

        int count = 0;
        int index = 5;
        Node<Integer> newNode = new Node<>(100, null);
        while (current != null) {
            if (count == index - 1) {
                newNode.next = current.next;
                current.next = newNode;
            }

            current = current.next;
            count++;
        }

        current = head;

        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}
