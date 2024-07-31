package Linkedlist;

class Node {
    int val;
    Node next;
    Node(int x) {
        val = x;
        next = null;
    }
}

public class Result {
    public Node removeNthFromEnd(Node head, int n) {
        Node dummy = new Node(0);
        dummy.next = head;
        Node first = dummy;
        Node second = dummy;

        for (int i = 0; i <= n; i++) {
            first = first.next;
        }


        while (first != null) {
            first = first.next;
            second = second.next;
        }

        second.next = second.next.next;

        return dummy.next;
    }

    public static void main(String[] args) {
        // Example usage:
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        Result solution = new Result();
        Node newHead = solution.removeNthFromEnd(head, 2);


        Node current = newHead;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }

}

