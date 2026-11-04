package DSAPrograms;

public class MiddleLinkedList {

    public ListNode findMiddle(ListNode head) {

        if (head == null) {
            return null;
        }

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public static void main(String[] args) {

        ListNode l1 = new ListNode(5);
        ListNode l2 = new ListNode(56);
        ListNode l3 = new ListNode(63);
        ListNode l4 = new ListNode(12);
        ListNode l5 = new ListNode(20);

        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;

        ListNode head = l1;

        MiddleLinkedList obj = new MiddleLinkedList();

        ListNode mid = obj.findMiddle(head);

        if (mid != null) {
            System.out.println("Middle element: " + mid.val);
        } else {
            System.out.println("Linked list is empty");
        }
    }
}