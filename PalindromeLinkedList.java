package Linkedlist;

class ListNodee {
    int value;
    ListNodee next;
    ListNodee(int value) {
        this.value = value;
        this.next = null;
    }
}

public class PalindromeLinkedList {
    public boolean isPalindrome(ListNodee head) {
        if (head == null || head.next == null) {
            return true;
        }

        // Find the middle of the LinkedList
        ListNodee slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse the second half of the LinkedList
        ListNodee prev = null, curr = slow, next = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // Compare the first half and the reversed second half
        ListNodee firstHalf = head, secondHalf = prev;
        while (secondHalf != null) {
            if (firstHalf.value != secondHalf.value) {
                return false;
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        return true;
    }

    public static void main(String[] args) {
        PalindromeLinkedList pll = new PalindromeLinkedList();
        ListNodee head = new ListNodee(1);
        head.next = new ListNodee(2);
        head.next.next = new ListNodee(2);
        head.next.next.next = new ListNodee(1);

        System.out.println(pll.isPalindrome(head)); // Output: true
    }
}

