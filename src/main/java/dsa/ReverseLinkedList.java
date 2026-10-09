package dsa;

public class ReverseLinkedList {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);

        System.out.println("Before Reverse: " + head.val + " " + head.next.val + " " + head.next.next.val);

        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        System.out.print("\nAfter Reverse: ");
        while (prev != null) {
            System.out.print(prev.val + " ");
            prev = prev.next;
        }
    }
}
