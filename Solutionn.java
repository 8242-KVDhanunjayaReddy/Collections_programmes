package Linkedlist;

class ListNod {
    int val;
    ListNod next;
    ListNod(int x) {
        val = x;
        next = null;
    }
}

public class Solutionn {
    public ListNod getIntersectionNode(ListNod headA, ListNod headB) {
        if (headA == null || headB == null) return null;

        ListNod a = headA;
        ListNod b = headB;

        while (a != b) {
            a = (a == null) ? headB : a.next;
            b = (b == null) ? headA : b.next;
        }
        return a;
    }
}

