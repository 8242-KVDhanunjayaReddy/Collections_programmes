package Linkedlist;

class ListNode {
    int val;
    ListNod next;
    ListNode(int x) { val = x; }
}

public class MergeSortedLists {
    public ListNod mergeTwoLists(ListNod l1, ListNod l2) {
        ListNod dummy = new ListNod(0);
        ListNod current = dummy;

        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                current.next = l1;
                l1 = l1.next;
            } else {
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }

        if (l1 != null) {
            current.next = l1;
        } else {
            current.next = l2;
        }

        return dummy.next;
    }
}

