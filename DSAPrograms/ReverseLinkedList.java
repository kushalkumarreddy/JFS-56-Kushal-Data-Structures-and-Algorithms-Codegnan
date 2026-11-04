package DSAPrograms;

public class ReverseLinkedList {

    public ListNode reverseWithSp(ListNode head) {

        if (head == null) {
            return null;
        }

        if (head.next == null) {
            return head;
        }

        ListNode preNode = null;
        ListNode curNode = head;

        while (curNode != null) {

            ListNode nextNode = curNode.next;

            curNode.next = preNode;

            preNode = curNode;
            curNode = nextNode;
        }

        head = preNode;

        return head;
    }

    public void traverse(ListNode head) {

        ListNode ptr = head;

        while (ptr != null) {
            System.out.print(ptr.val + " -> ");
            ptr = ptr.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        ListNode l1 = new ListNode(5);
        ListNode l2 = new ListNode(56);
        ListNode l3 = new ListNode(63);
        ListNode l4 = new ListNode(12);

        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = null;

        ListNode head = l1;

        ReverseLinkedList rs = new ReverseLinkedList();

        System.out.println("---- Original Linked List ----");
        rs.traverse(head);

        System.out.println();

        System.out.println("---- Reversed Linked List ----");
        head = rs.reverseWithSp(head);
        rs.traverse(head);
    }
}